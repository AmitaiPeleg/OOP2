package HW3.Q3;

public class Program {
    public static void main(String[] args) {
        // Creating sets with different object types
        Set set1 = new Set(10, 1, 2, 3.2, 4, 5);
        Set set2 = new Set(10, "apple", "banana", 1, 2, 3);

        // Showing the sets
        System.out.println("Set 1: " + set1.toString());
        System.out.println("Set 2: " + set2.toString());

        // Adding sets together
        Set addedSet = (Set) set1.add(set2);
        System.out.println("Added Set: " + addedSet.toString());

        // Subtracting sets (Set 1 - Set 2)
        Set subtractedSet = (Set) set1.sub(set2);
        System.out.println("Subtracted Set (Set1 - Set2): " + subtractedSet.toString());

        // Multiplying sets (Set 1 ∩ Set 2)
        Set multipliedSet = (Set) set1.mul(set2);
        System.out.println("Multiplied Set (Set1 ∩ Set2): " + multipliedSet.toString());

        // Demonstrating ScanOp functionality
        set1.reset();  // Resetting to the first element
        System.out.println("First element in Set 1: " + set1.getCurrent());

        // Moving forward and backward
        if (set1.forward()) {
            System.out.println("After forward: " + set1.getCurrent());
        }
        if (set1.forward()) {
            System.out.println("After another forward: " + set1.getCurrent());
        }
        if (set1.backward()) {
            System.out.println("After backward: " + set1.getCurrent());
        }
        if (set1.backward()) {
            System.out.println("After another backward: " + set1.getCurrent());
        }

        // Resetting and showing the current element again
        set1.reset();
        System.out.println("After reset, current element: " + set1.getCurrent());

        // Demonstrating getAllClass
        System.out.println("All classes in Set 1:");
        Class[] allClasses = set1.getAllClass();
        for (Class c : allClasses) {
            System.out.println(c.getName());
        }

        // Demonstrating getArrayClass
        System.out.println("Elements of type Integer in Set 1:");
        Object[] integerArray = set1.getArrayClass(Integer.class);
        for (Object obj : integerArray) {
            System.out.println(obj);
        }

        System.out.println("Elements of type Double in Set 1:");
        Object[] doubleArray = set1.getArrayClass(Double.class);
        for (Object obj : doubleArray) {
            System.out.println(obj);
        }
    }
}
