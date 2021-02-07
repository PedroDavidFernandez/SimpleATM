package com.model.card;

public class Card {
    private int cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private int securityNumber;

    public Card(
            int cardNumber,
            String cardHolderName,
            String expirationDate,
            int securityNumber
    ) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.securityNumber = securityNumber;
    }

    public void printCardDetails() {
        System.out.println(
                "Card Number: " + this.cardNumber + " " +
                "Card Holder Name: " + this.cardHolderName + " " +
                "Expiration Date: " + this.expirationDate + " " +
                "Security Number: " + this.securityNumber
        );
    }
}
