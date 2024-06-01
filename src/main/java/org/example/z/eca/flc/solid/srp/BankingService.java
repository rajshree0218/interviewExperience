package org.example.z.eca.flc.solid.srp;

public class BankingService {

    public void withdraw(int accountNo, double amount){
        System.out.printf("Rs/- %s debited from account %s%n", amount, accountNo);
    }

    public void deposit(int accountNo, double amount){
        System.out.printf("Rs/- %s credited to account %s%n", amount, accountNo);
    }

}
