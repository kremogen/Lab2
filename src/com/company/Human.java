package com.company;

public class Human {
    Head golova = new Head(10, 11);
    Leg noga = new Leg(10, 11);
    Hand ruka = new Hand(10, 11);
    public void info(){
        System.out.println("Голова = " + this.golova.toString());
        System.out.println("Нога = " + this.noga.toString());
        System.out.println("Рука = " + this.ruka.toString());
    }
}
