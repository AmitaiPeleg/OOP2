package HW2;

public abstract class Polygon extends TwoDimensional {
    public Polygon(int a, int b) {
        super(a, b);
    }

    public double area() {
        return length * width;
    }

    public double circ() {
        return 2 * (length + width);
    }
}
