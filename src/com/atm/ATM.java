package com.atm;

import com.model.account.Account;
import com.model.card.Card;

import java.util.Scanner;

public class ATM {
    private Account account;
    private Card card;

    public ATM() {
    }

    public ATM(Account account) {
        this(account, null);
    }

    public ATM(Account account, Card card) {
        this.account = account;
        this.card = card;
    }

    public void display() {
        System.out.println("Welcome " + this.account.getFirstName() + " " + this.account.getLastName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select one of the following options." +
                " Press a letter key to exit, please.");
        System.out.println("Press 1 to deposit cash: ");
        System.out.println("Press 2 to withdraw cash: ");

        do {
            double amount = 0;
            boolean isANumber = scanner.hasNextInt();
            if (!isANumber) {
                System.out.println("por aqui");
                return;
            }
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();
                    deposit(amount);
                    return;
                case 2:
                    System.out.println("Amount: ");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                    return;
                default:
                    System.out.println("nothing to do");
            }

        } while (!scanner.hasNextInt());
        scanner.close();
    }

    private void deposit(double amount) {
        this.account.setBalance(amount + this.account.getBalance());
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
