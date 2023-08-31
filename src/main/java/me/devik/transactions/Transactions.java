package me.devik.transactions;


import org.yaml.snakeyaml.Yaml;

import java.io.File;

public class Transactions {

    File file = new File("src/main/resources/transactions.yaml");
    Yaml yaml = new Yaml();
    String transactions = "It should be in .yaml file!";

    public void printTransactions() {
        System.out.println("Here are your transactions: " + transactions);
    }

    // Saving transaction
    // transaction_001:
    //     amountMoney: 1000
    //     paying: false
    //     getting money: true

}
