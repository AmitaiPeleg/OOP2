package HW2;

public abstract class ThreeD extends Shape {
    protected int rd;

    public ThreeD(int r) {
        rd = r;
    }

    public abstract double volume();

    public abstract double area();

    public int compare() {
        return 0;
    }

}
