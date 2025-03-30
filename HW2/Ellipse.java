package HW2;

public class Ellipse extends EllipseFamily {
    public Ellipse(int a, int b) {
        super(a, b);
    }

    public double circ() {
        // length is the long
        // width is the short
        double x = Math.sqrt((length + 3 * width) * (3 * length + width));
        double y = 3 * (length + width) - x;
        return Math.PI * y;
    }

    public String toString() {
        return "TwoDimensional , long: " + length + "short: " + width;
    }
}
