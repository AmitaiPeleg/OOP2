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
public boolean equals(Shape other){
    if (super.equals(other)) {
        ThreeD s = (ThreeD) other;
        if (this.rd!=s.rd) {
            return false;
        }
    }
    else{
        return false;
    }
    return true;
}
}
