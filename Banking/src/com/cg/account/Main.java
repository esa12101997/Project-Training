package com.cg.account;


public class Main {

    public static void main(String[] args) {

        Account esasAccount = new Account("121212",0,"Esa","esa@xyz.com","1212121");

        esasAccount.DepositMoney(50);
        esasAccount.DepositMoney(150);

        esasAccount.WithDrawMoney(100);
    
    }
}
