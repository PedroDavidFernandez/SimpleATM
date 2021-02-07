package com.atm;

import com.model.account.Account;
import com.model.card.Debit;

public class ATMDriver {
    public static void main(String[] args) {
        Account account = new Account(
                "000489234-SD",
                "Tom",
                "Hanks",
                15000.00,
                "USD"
        );

        Debit card = new Debit(
                938004555,
                "TOM HANKS",
                "12/23",
                745,
                "WELLS FARGO"
                );

        ATM atm = new ATM(account);
        atm.display();
    }
}
