package HW2;

public abstract class Shape {
    public abstract double area();

    public int compare(Shape other) {

        double diff = this.area() - other.area();
        if (diff > 0) {
            return 1;
        }
        if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equals(Shape other) {
        if (!(this.getClass() == other.getClass())) {
            return false;
        }
        return true;
    }
}
