package com.model.card;

import java.util.Date;

public class Credit extends Card{
    private final Type type = Type.CREDIT;
    private String bank;
    private double credit;

    public Credit(
            int cardNumber,
            String cardHolderName,
            String expirationDate,
            int securityNumber,
            String bank,
            double credit
    ) {
        super(cardNumber, cardHolderName, expirationDate, securityNumber);
        this.bank = bank;
        this.credit = credit;
    }

    public void printBank() {
        System.out.println("Bank: " + bank);
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public void printCardDetails() {
        super.printCardDetails();
        System.out.println("Bank: " + bank);
    }
}
