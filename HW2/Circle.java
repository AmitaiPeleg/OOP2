package HW2;

public class Circle extends EllipseFamily {
    public Circle(int r) {
        super(r, r);
    }

    public double area() {
        return super.area();
    }

    public double circ() {
        return 2 * length * Math.PI;
    }
}
