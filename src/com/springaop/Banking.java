/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springaop;

/**
 *
 * @author BA391760
 */
public class Banking implements IBanking {

    public static double balance = 50000;

    @Override
    public double deposit(double amount) {
        System.out.println("The current balance:" + " " + balance);
        balance += amount;
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > balance) {
            return balance;

        } else {
            balance -= amount;
            return balance;
        }

    }
}
