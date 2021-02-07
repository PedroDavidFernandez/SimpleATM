package com.model.account;

public class Account {
    private String accountNumber;
    private String firstName;
    private String lastName;
    private double balance;
    private String bank;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String currency;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public Account(
            String accountNumber,
            String firstName,
            String lastName,
            double balance,
            String currency,
            String bank
    ) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.currency = currency;
        this.bank = bank;
    }

    public void printAccountDetails() {
        System.out.println(
                "Account Number: " + this.accountNumber + " " +
                "First Name: " + this.firstName + " " +
                "Last Name: " + this.lastName + " " +
                "Balance: " + this.balance + " " +
                "Currency: " + this.currency + " "
        );
    }
}
