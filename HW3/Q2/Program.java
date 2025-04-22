package HW3.Q2;

public class Program {
    public static void main(String[] args) {
        // יצירת אובייקטים מסוג Showable
        Showable[] showableArray = new Showable[] {
                new ShowableObject1("First"),
                new ShowableObject1("Second"),
                new ShowableObject2("Third")
        };

        // יצירת מערך אובייקטים מסוג Object
        Object[] objectArray = new Object[] {
                new ShowableObject1("First"),
                new ShowableObject1("Second"),
                new ShowableObject1("Third"),
                
        };

        // קריאה לשיטה showAll עם מערך של Showable[]
        System.out.println("Showing all Showable objects:");
        Utility.showAll(showableArray);

        // קריאה לשיטה showAll עם מערך של Object[]
        System.out.println("\nShowing all objects:");
        Utility.showAll(objectArray);

        // קריאה לשיטה search
        System.out.println("=====");
        Object searchObject = new ShowableObject1("First");
        boolean found = Utility.search(objectArray, searchObject);
        System.out.println("\nSearch result for " + searchObject.toString() + ": " + found);

        // קריאה לשיטה max
        Object maxObject = Utility.max(objectArray);
        System.out.println("\nMax object: " + maxObject);
    }
}
