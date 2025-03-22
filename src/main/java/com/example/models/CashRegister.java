package com.example.models;

public class CashRegister {
    public double cash;
    public double total;

    public CashRegister(double cash, double total) {
        this.cash = cash;
        this.total = total;
    }

    public double purchase(double price) {
        if (cash >= price) {
            cash -= price;
            total += price;
            return price;
        }
        return 0;
    }
}
