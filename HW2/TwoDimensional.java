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

    public boolean equals(Shape other) {
        if (super.equals(other)) {
            TwoDimensional s = (TwoDimensional) other;
            if (this.length != s.length || s.width != this.width) {
                return false;
            }
        }
        return true;
    }
}
