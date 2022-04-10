package com.company;

public class Items {

    private int force;
    private int price;

    public Items (int force, int price) {

        this.force = force;
        this.price = price;

    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString () {
        return " Добавит силы:  " + force +
                "\n Его стоимость: " + price;
    }
}


