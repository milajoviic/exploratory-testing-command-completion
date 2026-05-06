import interfaces.Bike;
import interfaces.Vehicle;

public class Main {

    public static void main(String[] args) {
        String test = "Hello!";
        int x = 2;
        int y = 3;

        for (int i = 0; i < 100; i++) System.out.println(i);

        if (x < y) test = "Hello!";
        else test = "Bye!";

        String test2 = "lalala..";

        String w = "world"; //at first this was float.

        int u = 0;
        do {
            u++;
        } while (10 > u);

        //..

        switch (u) {
            case 1:
                break;
            case 10: //added using . or ..
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + u);
        }

        String s = null;
        System.out.println(s);

        int a = 2;
        int z = x + a;

        Adder adder;
        Vehicle vehicle = new Bike(12,12);
    }
}