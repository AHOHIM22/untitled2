package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Game {

    int hp=100;
    int energy=100;
    int money=30;
    double force=1;

    Scanner consol= new Scanner(System.in);
    SecureRandom random= new SecureRandom();
    public Game(){
        System.out.println("Игра запущена"+
                "\n Приветствую в нашей игре"+
                "\n Демо Версия 'Авантюриста'");
    }

    public void boy(){
        while (energy > 0) {
            System.out.println("HP=" + hp);
            System.out.println("ЭНЕРГИЯ=" + energy);
            System.out.println("Деньги=" + money);
            System.out.println("Cила=" + force);
            choice();
        }


    }
    public void choice(){
        System.out.println("Выбыбор вашых действий:"+
                " \n 1 -Сражаться с монстрами" +
                        "\n 2 -Попрошайничать(-5 strength)" +
                        "\n 3  -Посетить Магазин");
        int vidorАctions=consol.nextInt();
        switch (vidorАctions){
            case 1:fightMonster();
                break;
            case 2:moneyDonated();
                break;
            case 3:shop();
                break;
        }

    }

    public void fightMonster(){
        System.out.println("Выберите сложность монстра:" +
            " \n 1 - Легкий(-10 strength) " +
            "\n 2 - Средний(-20 strength) " +
            "\n 3 - Сложный (-30 strength) " +
            "\n 4 - Босс(-50 strength)");
        int viborMonstra=consol.nextInt();
        switch (viborMonstra){
            case 1:fightEasyMonster();
                break;
            case 2:fightNormolMonster();
                break;
            case 3:fightHardMonster();
                break;
            case 4:bossMonster();
                break;
        }

    }
    public void fightEasyMonster(){
        energy-=10;
        double monsterForse=random.nextInt(21)/10;
        if(force>monsterForse){
            System.out.println("ВЫ попедили: Сила+1 Деньги +5");
            money+=5;
        }else
            System.out.println("ВЫ проиграли: Потеря 5 HP");
        hp-=5;
        System.out.println("Сила монстра="+monsterForse);
        hp-= monsterForse;
    }
    public void fightNormolMonster(){
        energy-=20;
        double monsterForse=random.nextInt(31)/10+2;
        if(force>monsterForse){
            System.out.println("ВЫ попедили: Деньги +15");
            money+=15;
        }else
            System.out.println("ВЫ проиграли: Потеря 10 HP");
        hp-=10;
        System.out.println("Сила монстра="+monsterForse);
        hp-= monsterForse;
    }
    public void fightHardMonster() {
        energy -= 30;
        double monsterForse = random.nextInt(41) / 10+3;
        if (force > monsterForse) {
            System.out.println("ВЫ попедили: Деньги +50");
            money += 50;
        } else
            System.out.println("ВЫ проиграли: Потеря 20 HP");
        hp-=20;
        System.out.println("Сила монстра=" + monsterForse);
        hp -= monsterForse;
    }
    public void bossMonster() {
        energy -= 50;
        double monsterForse = random.nextInt(51) / 10+5;
        if (force > monsterForse) {
            System.out.println("ВЫ попедили: Деньги +100");
            money += 100;
        } else
            System.out.println("ВЫ проиграли: Потеря 50 HP");
        hp-=50;
        System.out.println("Сила монстра=" + monsterForse);
        hp -= monsterForse;
    }
    public void moneyDonated(){
        int donated = random.nextInt(50);
        money+=donated;
        System.out.println("Поздравляю вы получили " + donated + " монет с подачек");
        energy-=5;
    }
    public void shop(){
        System.out.println("На прилавке: " +
                "\n1)Дбина- Цена 20 Сила +1" +
                "\n2)Ржавый Меч- Цена 50 Сила +4 " +
                "\n3)Превосходный Меч - Цена 100 Сила +7" +
                "\n4)Меч Легенд- Цена 500 Сила +10" +
                "\n5)Зелье лечения - Цена 50 Лечит 15" +
                "\n6)Большое зелье лечения - Цена 150 Лечит 50"+
                "\n7)Зелье вынослиость - Цена 70 Вынослиость+50");
        int cudgel=20;
        int rustsyword=50;
        int superiorSword= 100;
        int SwordofLegends= 500;
        int HealingPotion=50;
        int MajorHealingPotion=150;
        int PotionofEndurance=70;



        int shopChoose=consol.nextInt();{
            switch (shopChoose){
                case 1: if (money < cudgel){
                    System.out.println("У вас недостаточно средств");
                } else {
                    System.out.println("Поздравляю с покупкой");
                    money-=cudgel;
                    force+=1;
                }
                    break;
                case 2: if (money <rustsyword){
                    System.out.println("У вас недостаточно средств");
                } else {
                    System.out.println("Поздравляю с покупкой");
                    money-=rustsyword;
                    force+=4;
                }
                    break;
                case 3: if (money < superiorSword){
                    System.out.println("У вас недостаточно средств");
                } else {
                    System.out.println("Поздравляю с покупкой");
                    money-=superiorSword;
                    force+=7;
                }
                    break;
                case 4: if (money < SwordofLegends){
                    System.out.println("У вас недостаточно средств");
                } else {
                    System.out.println("Поздравляю с покупкой");
                    money-=SwordofLegends;
                    force+=10;
                }
                    break;
                case 5: if (money < HealingPotion){
                    System.out.println("У вас недостаточно средств");
                } else {
                    System.out.println("Поздравляю с покупкой");
                    money-=HealingPotion;
                    hp+=50;
                }
                    break;
                case 6: if (money < MajorHealingPotion){
                    System.out.println("У вас недостаточно средств");
                } else {
                    System.out.println("Поздравляю с покупкой");
                    money-=MajorHealingPotion;
                    hp+=50;
                }
                    break;
                case 7: if (money < PotionofEndurance){
                    System.out.println("У вас недостаточно средств");
                } else {
                    System.out.println("Поздравляю с покупкой");
                    money-=PotionofEndurance;
                    energy+=50;
                }
                    break;
            }
        }
    }


}

