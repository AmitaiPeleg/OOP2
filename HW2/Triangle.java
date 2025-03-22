package HW2;

public class Triangle extends Polygon {
    public Triangle(int heigth, int base) {
        super(heigth, base);
    }

    public double area() {
        return super.area() / 2;
    }

    public double circ() {
        double y = length * length + width * width;
        double yeter = Math.sqrt(y);
        return yeter + length + width;
    }
}
