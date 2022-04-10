package com.company;

import java.util.Scanner;

public class Monster {

    private int money;
    private int energy;
    private int force;

    public Monster( int money, int energy, int force) {
        this.money = money;
        this.energy = energy;
        this.force = force;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString () {
        return " За него награда: " + money +
                "\n Его сила:  " + force +
                "\n Вам потребуется энергия: " + energy;
    }


}
