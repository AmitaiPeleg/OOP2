package HW2;

public abstract class TwoDimensional extends Shape {
    protected int length;
    protected int width;

    public TwoDimensional(int l, int w) {
        length = l;
        width = w;
    }

    public abstract double area();

    public abstract double circ();

    public String toString() {
        return "is TwoDimensional, length: " + length + " width: " + width;
    }

    public int compare(Shape s) {
        if (!(s instanceof TwoDimensional)) {
            return -1;
        }
        TwoDimensional tS = (TwoDimensional) s;
        if (this.area() > tS.area()) {
            return 1;
        }
        if (this.area() < tS.area()) {
            return -1;
        } else {
            return 0;
        }
    }
}
