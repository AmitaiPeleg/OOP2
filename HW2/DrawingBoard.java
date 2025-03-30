package HW2;

public class DrawingBoard {
    private Shape[] s;
    private int counter = 0;

    public DrawingBoard(int size) {
        s = new Shape[size];
    }

    public void add(Shape... shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (counter == s.length) {
                Shape[] sh = new Shape[s.length];
                for (int j = 0; j < s.length; j++) {
                    sh[j] = s[j];
                }
                int a = (int) ((int) s.length * 1.5);
                s = new Shape[a];
                for (int k = 0; k < sh.length; k++) {
                    s[k] = sh[k];
                }
            }
            s[counter] = shapes[i];
            counter++;
        }

    }

    public void showAll() {
        for (int i = 0; i < counter; i++) {
            System.out.println(s[i].toString());
        }
    }

    public Shape getMax() {
        Shape best = s[0];
        double max = s[0].area();
        for (int i = 1; i < counter; i++) {
            if (s[i].area() > max) {
                best = s[i];
                max = s[i].area();
            }
        }
        return best;
    }

    public ThreeD getMax3DV1() {
        ThreeD best = null;
        double max = 0;
        for (int i = 0; i < counter; i++) {
            if (s[i] instanceof ThreeD) {
                ThreeD t = (ThreeD) s[i];
                if (t.volume() > max) {
                    best = t;
                    max = t.volume();
                }

            }
        }
        return best;
    }

    public ThreeD getMax3DV2() {
        ThreeD best = null;
        double max = 0;
        for (int i = 0; i < counter; i++) {
            if (s[i].getClass() == Cube.class || s[i].getClass() == Ball.class) {
                ThreeD t = (ThreeD) s[i];
                if (t.volume() > max) {
                    best = t;
                    max = t.volume();
                }

            }
        }
        return best;
    }
}
