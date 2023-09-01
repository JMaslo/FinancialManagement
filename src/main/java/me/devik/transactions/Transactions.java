package me.devik.transactions;


import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Transactions {

    File file = new File("src/main/resources/transactions.yaml");
    Yaml yaml = new Yaml();
    String transactions = "It should be in .yaml file!";

    public void printTransactions(){
        System.out.println("Here are your transactions: " + transactions);
    }

    public void saveTransaction( long amountMoney, boolean paying, boolean getMoney ){
        Map<String, Object> data = new HashMap<>();
        data.put("amountMoney", amountMoney);
        data.put("paying", paying);
        data.put("getMoney", getMoney);

        try ( FileWriter fileWriter = new FileWriter(file) ){

            yaml.dump(data, fileWriter);
            System.out.println("Data written in transactions.yaml!");

        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    // Saving transaction
    // transaction_001:
    //     amountMoney: 1000
    //     paying: false
    //     getting money: true

}
