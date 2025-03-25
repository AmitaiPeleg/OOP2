package HW2;

public abstract class EllipseFamily extends TwoDimensional {
    public EllipseFamily(int a, int b) {
        super(a, b);
    }

    public double area() {
        return length * width * Math.PI;
    }
    public abstract double circ();

}