package HW2;

public class Ball extends ThreeD {
    public Ball(int r) {
        super(r);
    }

    public double volume() {
        int a = 4 / 3;
        int r = rd * rd * rd;
        return a * r * Math.PI;
    }

    public double surfaceArea() {
        return 4 * Math.PI * rd * rd;
    }
}
