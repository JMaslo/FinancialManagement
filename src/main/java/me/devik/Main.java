package me.devik;


import me.devik.account.Account;

import java.util.Scanner;

public class Main {

    static Account accountManager = new Account();
    static String money_intro;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        introduction();

        if (money_intro.equalsIgnoreCase("money")) {
            accountManager.seeMoney();
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
        System.out.println("- See your money -> type: money");
        money_intro = sc.next();
    }
}