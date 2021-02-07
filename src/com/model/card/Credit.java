package com.model.card;

import java.util.Date;

public class Credit extends Card{
    private final Type type = Type.CREDIT;
    private String bank;

    public Credit(
            int cardNumber,
            String cardHolderName,
            String expirationDate,
            int securityNumber,
            String bank
    ) {
        super(cardNumber, cardHolderName, expirationDate, securityNumber);
        this.bank = bank;
    }

    public void printBank() {
        System.out.println("Bank: " + bank);
    }

    @Override
    public void printCardDetails() {
        super.printCardDetails();
        System.out.println("Bank: " + bank);
    }
}
