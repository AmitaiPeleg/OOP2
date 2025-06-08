package Hw6.Q2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable<T>> implements MinMax<T> {
    private List<T> elements;

    public MyList() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T min() {
        if (elements.isEmpty())
            return null;
        T min = elements.get(0);
        for (T e : elements) {
            if (e.compareTo(min) < 0) {
                min = e;
            }
        }
        return min;
    }

    public T max() {
        if (elements.isEmpty())
            return null;
        T max = elements.get(0);
        for (T e : elements) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }
}
