package com.company;

public class Hero {

    private int hp;
    private int energy;
    private int money;
    private int force;

    public Hero(int hp,int energy,int money,int force){
        this.hp=hp;
        this.energy=energy;
        this.money=money;
        this.force=force;
    };

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
    @Override
    public String toString() {
        return "Ваши HP:"+ hp+
                "\nВаша Энергия: " + energy +
                "\nВаши монеты:" + money
                + "\nВаша Сила:  " + force;
    }

}
