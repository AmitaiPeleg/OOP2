package Q1;
public class Program {
    public static void main(String[] args) {
        LockableDoor l1 = new LockableDoor();
        l1.close();
        l1.showIsLocked();
        l1.lock();
        l1.showIsLocked();
        l1.unLock();
        l1.showIsLocked();
        l1.open();
        System.out.println(l1.isOpen());
    }
}
