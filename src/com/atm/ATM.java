package com.atm;

import com.model.account.Account;
import com.model.card.Card;

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
