package me.devik;


import me.devik.account.Account;
import me.devik.transactions.Transactions;

import java.util.Scanner;

public class Main {

    static Account accountManager = new Account();
    static Transactions transactionsManager = new Transactions();
    static String intro;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        introduction();

        if (intro.equalsIgnoreCase("money")) {
            accountManager.seeMoney();
        } else if (intro.equalsIgnoreCase("transactions")) {
            transactionsManager.printTransactions();
        }

        /* Structure
        * - Main.java
        * - account
        *   - Account.java ( Status of money, name, e-mail, change name/e-mail)
        * - transactions
        *   - Transactions.java ( Daily limit, payment methods )
        * */
    }

    public static void introduction() {
        System.out.println("Welcome in our program!");
        System.out.println("What do you want to do?");
        System.out.println("Here are your options:");
        System.out.println("- See your balance -> type: money");
        System.out.println("- See your transactions -> type: transactions");
        intro = sc.next();
    }
}