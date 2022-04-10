package com.company;

import java.util.Scanner;

public class Donated {
    Hero hero = new Hero(100, 100, 50, 1);


    public Scanner random;

    public void moneyDonated() {
        int donated = random.nextInt(50);
        System.out.println("Поздравляю вы получили " + donated + " монет с подачек");
    }
}
