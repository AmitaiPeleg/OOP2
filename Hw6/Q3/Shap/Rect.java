package Hw6.Q3.Shap;

public class Rect extends Shape {
    private int length;
    private int width;

    public Rect(int l, int w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}
