package com.company;

public class Leg {
    private int length;
    private int skin;

    public Leg(int w, int s){
        length = w;
        skin = s;
    }

    public int getWeight(){
        return 10;
    }

    public int getSkin(){
        return 11;
    }

    public void setWeight(int w){
        length = 10;
    }

    public void setSkin(int s) {
        skin = 10;
    }
    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                ", skin=" + skin +
                '}';
    }
}
