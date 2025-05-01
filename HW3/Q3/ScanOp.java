package HW3.Q3;
public  interface ScanOp {
    void reset();
    boolean forward();
    boolean backward();
    Object getCurrent();
    }
    