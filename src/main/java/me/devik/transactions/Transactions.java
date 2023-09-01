package me.devik.transactions;


import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Transactions {

    File file = new File("src/main/resources/transactions.yaml");
    Yaml yaml = new Yaml();
    String transactions = "It should be in .yaml file!";

    public void printTransactions(){
        System.out.println("Here are your transactions: " + transactions);
    }

    public void writeIntoYaml(long amountMoney, boolean paying, boolean getMoney){
        Map<String, Object> data = new HashMap<>();
        data.put("amountMoney", amountMoney);
        data.put("paying", paying);
        data.put("getMoney", getMoney);
    }

    // Saving transaction
    // transaction_001:
    //     amountMoney: 1000
    //     paying: false
    //     getting money: true

}
