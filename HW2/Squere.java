package HW2;

public class Squere extends Polygon {
    public Squere(int l) {
        super(l, l);
    }
    public static void main(String[] args) {
        Squere s = new Squere(5);
        s.show();
    }
}
