package Q1;
public class LockableDoor extends Door {
    private boolean isLock;

    public LockableDoor() {
        super(true);
        isLock = false;
    }
    public void open(){
        if (!isLock) {
            super.open();
        }
        else{
            System.out.println("the door is locked");
        }
    }
   
    public void lock(){
        if (!isOpen()) {
            isLock = true;
        }
        else{
            System.out.println("you have to close the door");
        }
    }
    public void unLock(){
        isLock = false;
    }
    public void showIsLocked(){
        if (isLock) {
            System.out.println("the door is locked");
        }
        else{
            System.out.println("the door is open");
        }
    }
}
