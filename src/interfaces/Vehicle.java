package interfaces;

public interface Vehicle{
    void changeGear();
    void speedUp(int su);
    void applyBrakes();

    private void startEngine()
    {
        System.out.println("Starting engine ...");
    }

    default void drive() {
        startEngine();
       System.out.println("Driving");
    }

    private void stop()
    {
        System.out.println("Stopping engine ...");
    }
}
