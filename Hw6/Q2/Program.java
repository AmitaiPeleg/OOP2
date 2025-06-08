package Hw6.Q2;

public class Program {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(3);

        System.out.println("Min: " + list.min()); // 2
        System.out.println("Max: " + list.max()); // 8
    }
}
