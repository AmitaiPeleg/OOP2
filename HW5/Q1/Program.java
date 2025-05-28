package HW5.Q1;

public class Program {
    public static void main(String[] args) {
        List list = new List("MyList");

        System.out.println("Is the list empty? " + list.isEmpty());

        list.insertAtBack(new ListNode("Apple"));
        list.insertAtBack(new ListNode("Banana"));
        list.insertAtBack(new ListNode("Cherry"));
        list.print();

        list.insertAtFront(new ListNode("Orange"));
        list.print();

        try {
            list.addAt(new ListNode("Mango"), 2); 
            list.print();
        } catch (ListIndexOutOfBound e) {
            System.out.println("Invalid index");
        }

        try {
            list.removeAt(1);
            list.print();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            list.removeFromFront();
            list.print();
        } catch (EmptyListException e) {
            System.out.println("List is empty");
        }

        try {
            list.removeFromBack();
            list.print();
        } catch (EmptyListException e) {
            System.out.println("List is empty");
        }

        try {
            ListNode[] arr = list.toArray();
            System.out.println("Array contents:");
            for (ListNode node : arr) {
                System.out.println(node.getObject());
            }
        } catch (EmptyListException e) {
            System.out.println("List is empty");
        }
    }
}
