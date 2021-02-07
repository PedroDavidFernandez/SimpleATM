package com.atm;

import com.model.account.Account;
import com.model.card.Credit;

public class ATMDriver {
    public static void main(String[] args) {
        Account account = new Account(
                "000489234-SD",
                "Tom",
                "Hanks",
                15000.00,
                "USD",
                "WELLS FARGO"
        );

        Credit card = new Credit(
                938004555,
                "TOM HANKS",
                "12/23",
                745,
                "WELLS FARGO",
                25000
                );

        ATM atm2 = new ATM(account, card);
        atm2.display();
    }
}
