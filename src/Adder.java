import java.util.Objects;

public class Adder {
    private int a;
    private int b;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Adder adder = (Adder) o;
        return a == adder.a && b == adder.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Adder{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int Add()
    {
        int c = a + b;
        return c;
    }
}
