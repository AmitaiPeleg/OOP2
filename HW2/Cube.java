package HW2;

public class Cube extends ThreeD {
    public Cube(int length) {
        super(length);
    }

    public double volume() {
        return Math.pow(rd, 3);
    }

    public double surfaceArea() {
        return 6 * rd * rd;
    }
    public String toString(){
     return  "ThreeDimensional, length: "+ rd;
    }
}
