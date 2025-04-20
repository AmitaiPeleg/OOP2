package HW3.Q2;

public class ShowableObject1 implements Showable {
    private String name;

    public ShowableObject1(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public void show() {
        System.out.println("Object1: " + name);
    }

   

}
