package HW2;

public class Circle extends EllipseFamily {
    public Circle(int r) {
        super(r, r);
    }

    public double circ() {
        return 2 * length * Math.PI;
    }

    public String toString() {
        return "TwoDimensional , radius: " + length;
    }
}
