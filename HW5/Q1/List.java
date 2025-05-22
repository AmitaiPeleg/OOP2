package HW5.Q1;

public class List {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name;

    public List() {
        this("list");
    }

    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(Object insertItem) {
        if (isEmpty())
            firstNode = lastNode = new ListNode(insertItem);
        else
            firstNode = new ListNode(insertItem, firstNode);
    }

    public void insertAtBack(Object insertItem) {
        if (isEmpty())
            firstNode = lastNode = new ListNode(insertItem);
        else {
            ListNode last = new ListNode(insertItem);
            lastNode.setNext(last);
            lastNode = last;
        }
    }

    public Object removeFromFront() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException(name);
        Object removedItem = firstNode.getObject();

        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.getNext();
        return removedItem;
    }

    public Object removeFromBack() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException(name);

        Object removedItem = lastNode.getObject();
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else {
            ListNode current = firstNode;

            while (current.getNext() != lastNode)
                current = current.getNext();

            lastNode = current;
            current.setNext(null);
        }
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty " + name);
            return;
        }
        System.out.println("The " + name + " is : ");
        ListNode current = firstNode;

        while (current != null) {
            System.out.println(current.getObject());
            current = current.getNext();
        }
        System.out.println();
    }

    public String toString() {
        ListNode current = firstNode;
        String result = "";
        while (current != null) {
            result += current.toString();
            result += " ";
            current = current.getNext();
        }
        if (!isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public ListNode removeAt(int k) {
        if (k < 0) {
            throw new ListIndexOutOfBound();
        }
        if (isEmpty()) {
            throw new EmptyListException();
        }
        if (k == 0) {
            ListNode temp = firstNode;
            firstNode.setNext(null);
            firstNode = temp.getNext();
            return temp;
        } else {
            ListNode current = firstNode;

            for (int i = 0; i < k; i++) {
                if (current.getNext().getNext() == null) {
                    ListNode temp = current.getNext();
                    current.setNext(null);
                    lastNode = current;
                    return temp;
                }
                if (i == k - 1) {
                    ListNode temp = current.getNext();
                    current.setNext(current.getNext().getNext());
                    return temp;
                } else {
                    current = current.getNext();
                }
            }
        }
        throw new ListIndexOutOfBound();
    }

    public void show() {
        if (firstNode == null)
            return;
        else
            firstNode.show();
    }
}