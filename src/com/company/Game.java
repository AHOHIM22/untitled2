package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Game {

//    static Fight fight = new Fight();
    static Donated donated = new Donated();
    Scanner consol = new Scanner(System.in);
    SecureRandom random = new SecureRandom();
    Hero hero = new Hero(100, 100, 50, 1);
    Monster easyMonster = new Monster(10, 5, 1);
    Items items = new Items(10, 10);

    public Game() {
        System.out.println("Игра запущена" +
                "\n Приветствую в нашей игре" +
                "\n Демо Версия 'Авантюриста'");
    }

    public void boy() {
        while (hero.getEnergy() > 0) {
            System.out.println(hero);
            choice();
        }

    }

    public void choice() {
        System.out.println("Выбыбор вашых действий:" +
                " \n 1 -Сражаться с монстрами" +
                "\n 2 -Попрошайничать" +
                "\n 3  -Посетить Магазин");
        int vidorАctions = consol.nextInt();
        switch (vidorАctions) {
            case 1:
                fightMonster();
                break;
            case 2:
                donated.moneyDonated();
                ;
                break;
            case 3:
                ;
                break;
        }
    }

            public void fightMonster() {
            hero.setEnergy(hero.getEnergy()- easyMonster.getEnergy());
            if(hero.getForce()>easyMonster.getForce()){
                System.out.println("ВЫ попедили: Деньги +5");
                hero.setMoney(hero.getMoney()+easyMonster.getMoney());

            }else
                System.out.println("ВЫ проиграли: Потеря 5 HP");

        }


//    }
//      public void shop(){
//        System.out.println("На прилавке: " +
//                "\n1)Дбина- Цена 20 Сила +1" +
//                "\n2)Ржавый Меч- Цена 50 Сила +4 " +
//                "\n3)Превосходный Меч - Цена 100 Сила +7" +
//                "\n4)Меч Легенд- Цена 500 Сила +10" +
//                "\n5)Зелье лечения - Цена 50 Лечит 15" +
//                "\n6)Большое зелье лечения - Цена 150 Лечит 50"+
//                "\n7)Зелье вынослиость - Цена 70 Вынослиость+50");
//        int cudgel=20;
//        int rustsyword=50;
//        int superiorSword= 100;
//        int SwordofLegends= 500;
//        int HealingPotion=50;
//        int MajorHealingPotion=150;
//        int PotionofEndurance=70;
//
//
//
//        int shopChoose=consol.nextInt();{
//            switch (shopChoose){
//                case 1: if (money < cudgel){
//                    System.out.println("У вас недостаточно средств");
//                } else {
//                    System.out.println("Поздравляю с покупкой");
//                    money-=cudgel;
//                    force+=1;
//                }
//                    break;
//                case 2: if (money <rustsyword){
//                    System.out.println("У вас недостаточно средств");
//                } else {
//                    System.out.println("Поздравляю с покупкой");
//                    money-=rustsyword;
//                    force+=4;
//                }
//                    break;
//                case 3: if (money < superiorSword){
//                    System.out.println("У вас недостаточно средств");
//                } else {
//                    System.out.println("Поздравляю с покупкой");
//                    money-=superiorSword;
//                    force+=7;
//                }
//                    break;
//                case 4: if (money < SwordofLegends){
//                    System.out.println("У вас недостаточно средств");
//                } else {
//                    System.out.println("Поздравляю с покупкой");
//                    money-=SwordofLegends;
//                    force+=10;
//                }
//                    break;
//                case 5: if (money < HealingPotion){
//                    System.out.println("У вас недостаточно средств");
//                } else {
//                    System.out.println("Поздравляю с покупкой");
//                    money-=HealingPotion;
//                    hp+=50;
//                }
//                    break;
//                case 6: if (money < MajorHealingPotion){
//                    System.out.println("У вас недостаточно средств");
//                } else {
//                    System.out.println("Поздравляю с покупкой");
//                    money-=MajorHealingPotion;
//                    hp+=50;
//                }
//                    break;
//                case 7: if (money < PotionofEndurance){
//                    System.out.println("У вас недостаточно средств");
//                } else {
//                    System.out.println("Поздравляю с покупкой");
//                    money-=PotionofEndurance;
//                    energy+=50;
//                }
//                    break;
//            }
//        }
//    }

        }



