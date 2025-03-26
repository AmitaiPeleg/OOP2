package HW2;

public abstract class ThreeD {
    protected int rd;

    public ThreeD(int r) {
        rd = r;
    }

    public abstract double volume();

    public abstract double surfaceArea();
    
}
