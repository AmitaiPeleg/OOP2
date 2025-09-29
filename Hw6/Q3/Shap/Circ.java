package Hw6.Q3.Shap;

public class Circ extends Shape {
    private int radius;

    public Circ(int r) {
        radius = r;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
