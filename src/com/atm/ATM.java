package com.atm;

import com.model.account.Account;
import com.model.card.Credit;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ATM {
    private Account account;
    private Credit card;

    public ATM() {
    }

    public ATM(Account account) {
        this(account, null);
    }

    public ATM(Account account, Credit card) {
        this.account = account;
        this.card = card;
    }

    public void display() {
        System.out.println("Welcome " + this.account.getFirstName() + " " + this.account.getLastName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select one of the following options." +
                " Press a letter key to exit, please.");
        System.out.println(" ");
        System.out.println("Press 1 to deposit cash");
        System.out.println("Press 2 to withdraw cash");
        System.out.println("Press 3 to deposit credit on your Card");
        System.out.println("Press 4 Check your current account balance");
        System.out.println("Press 5 Check your current credit card balance");

        do {
            double amount = 0;
            boolean isANumber = scanner.hasNextInt();
            if (!isANumber) {
                return;
            }
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("Do you wish to do another operation? Y/N");
                    Scanner scanner2 = new Scanner(System.in);
                    String response = scanner2.next();
                    if (response.equals("Y")) {
                        display();
                    }
                    return;
                case 2:
                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                    return;
                case 3:
                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();
                    deposit(amount, this.card);
                    return;
                case 4:
                    System.out.println("Your current account balance is: " + this.account.getBalance());
                    return;
                case 5:
                    System.out.println("Your current credit card balance is: " + this.card.getCredit());
                    return;
                default:
                    System.out.println("Option is not valid!");
                    System.out.println("Hope to see you soon at bank " + this.account.getBank());
                    System.out.println("Press letter to exit");
            }
        } while (!scanner.hasNextInt());
        scanner.close();
    }

    private void deposit(double amount) {
        this.account.setBalance(amount + this.account.getBalance());
        System.out.println("Your current balance is: " + this.account.getBalance());
    }

    private void deposit(double amount, Credit card) {
        this.account.setBalance(amount + card.getCredit());
        System.out.println("Your current balance is: " + this.account.getBalance());
    }

    private void withdraw(double amount) {
        if (amount > this.account.getBalance()) {
            System.out.println("Amount is higher than current balance");
            return;
        }
        this.account.setBalance(this.account.getBalance() - amount);
        System.out.println("Your current balance is: " + this.account.getBalance());
    }

    public void atmSerialNumber() {
        System.out.println("XXX-YYY-ZZZ");
    }

    public void printCardDetails() {
        this.card.printCardDetails();
    }

    public void printAccountDetails() {
        this.account.printAccountDetails();
    }
}
