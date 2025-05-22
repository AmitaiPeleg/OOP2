package HW5.Q1;

public class ListNode {

    private Object data;
    private ListNode nextNode;

    public ListNode(Object o) {
        this(o, null);
    }

    public ListNode(Object o, ListNode node) {
        data = o;
        nextNode = node;
    }

    public Object getObject() {
        return data;
    }

    public ListNode getNext() {
        return nextNode;
    }

    public void setNext(ListNode ln) {
        nextNode = ln;
    }
}