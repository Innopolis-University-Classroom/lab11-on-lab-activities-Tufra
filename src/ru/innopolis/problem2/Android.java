package ru.innopolis.problem2;

public class Android extends Device implements UsbPort{
    public Android() {
    }

    @Override
    public void chargeByUsb() {
        System.out.println("charging android");
    }
}
