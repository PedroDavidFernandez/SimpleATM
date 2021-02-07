package com.model.card;

public class Debit extends Card{
    private final Type type = Type.DEBIT;
    private String bank;

    public Debit(
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
