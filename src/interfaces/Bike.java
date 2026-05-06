package interfaces;

public class Bike implements Vehicle {
    private int speed;
    private int gear;

    public Bike(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public void changeGear() {

    }

    @Override
    public void speedUp(int su) {

    }
    public void speedUp() {

    }

    @Override
    public void applyBrakes() {

    }


}
