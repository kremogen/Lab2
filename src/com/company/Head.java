package com.company;

public class Head {
    private int weight;
    private int skin;

    public Head(int w, int s){
        weight = 10;
        skin = 11;
    }

    public int getWeight(){
        return weight;
    }

    public int getSkin(){
        return skin;
    }

    public void setWeight(int w){
        weight = 10;
    }

    public void setSkin(int s) {
        skin = 10;
    }

    @Override
    public String toString() {
        return "Head{" +
                "weight=" + weight +
                ", skin=" + skin +
                '}';
    }
}
