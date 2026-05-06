package interfaces;

public class Bicycle implements Vehicle {
    private int speed;
    @Override
    public void changeGear() {
        
    }

    @Override
    public void speedUp(int su) {
        speed += su;
    }

    @Override
    public void applyBrakes() {
        speed = speed - 1;
    }
}
