package ru.innopolis.problem2;

public class UsbAdapter extends Android implements LightningPort{

    @Override
    public void chargeByLightning() {
        super.chargeByUsb();
    }
}
