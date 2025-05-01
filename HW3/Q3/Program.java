package HW3.Q3;



public class Program {
    public static void main(String[] args) {
        Set s = new Set(10, 1, 2, 3.2, 4, 5);

        System.out.println("Set: " + s);

        s.reset();

        System.out.println("Current object: " + s.getCurrent());

        System.out.println("Moving forward:");
        while (s.forward()) {
            System.out.println("Current object: " + s.getCurrent());
        }

        s.reset();

        System.out.println("Moving backward:");
        while (s.backward()) {
            System.out.println("Current object: " + s.getCurrent());
        }

        Set s2 = new Set(10, "hello", "world");
        Set resultSet = s.add(s2);
        System.out.println("Result of add operation: " + resultSet);

        Set subSet = s.sub(s2);
        System.out.println("Result of sub operation: " + subSet);
    }
}
    