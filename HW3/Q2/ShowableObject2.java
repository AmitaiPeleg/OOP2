package HW3.Q2;

public class ShowableObject2 implements Showable {
    private String description;

    public ShowableObject2(String description) {
        this.description = description;
    }

    @Override
    public void show() {
        System.out.println("Object2: " + description);
    }
}