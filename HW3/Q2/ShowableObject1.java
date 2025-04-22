package HW3.Q2;

public class ShowableObject1 implements Showable, Comparable {
    private String name;

    public ShowableObject1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void show() {
        System.out.println("Object1: " + name);
    }

    public int compareTo(Object other) {
        if (other instanceof ShowableObject1) {
            ShowableObject1 s = (ShowableObject1) other;
            return (this.name).compareTo(s.name);
        }
        return -1;
    }

}
