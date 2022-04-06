package ru.innopolis.problem2;

public class Iphone extends Device implements LightningPort{

    public Iphone() {
    }

    @Override
    public void chargeByLightning() {
        System.out.println("charging iphone");
    }
}
