package com.java.controljobcats;

public class Cats implements Catable{

    String name;
    int age;
    int mood;
    int health;
    int satiety;

    public Cats(String name, int age, int mood, int health, int satiety){
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.health = health;
        this.satiety = satiety;
    }


    @Override
    public void moodLevel() {

    }

    @Override
    public void satietyLevel() {

    }

    @Override
    public void healthLevel() {

    }
}
