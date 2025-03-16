package Q4;

public class Rect {
    private int length;
    private int width;

    public Rect(int l, int w) {
        length = l;
        width = w;
    }

    public int getArea() {
        return length * width;
    }

    public int getCirc() {
        return length * 2 + width * 2;
    }
}
