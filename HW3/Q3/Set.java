package HW3.Q3;

import HW3.Q1.Arithmetic;

public class Set implements Arithmetic {
    private Object[] objects;
    int count = 0;

    public Set(int size, Object... o) {
        objects = new Object[size];
        for (Object x : o) {
            // System.out.println(x.getClass().getName());
            boolean need_to_add = true;
            if (x == null) {
                continue;
            }
            for (int index = 0; index < count; index++) {
                Object y = objects[index];
                if (x.equals(y)) {
                    need_to_add = false;
                    break;
                }
            }
            if (need_to_add) {
                // o not in the currect objects. insert it
                System.out.println("adding " + x);
                objects[count] = x;
                count++;
            }
        }
    }

    @Override
    public String toString() {
        Object[] uniqueTypes = new Object[count];
        int uniqueCount = 0;

        // מציאת סוגי אובייקטים ייחודיים
        for (int i = 0; i < count; i++) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (objects[i].getClass() == uniqueTypes[j].getClass()) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueTypes[uniqueCount] = objects[i];
                uniqueCount++;
            }
        }

        String reString = "";

        // יצירת המחרוזת עבור כל סוג אובייקט
        for (int i = 0; i < uniqueCount; i++) {
            int typeCount = 0;
            for (int j = 0; j < count; j++) {
                if (uniqueTypes[i].getClass() == objects[j].getClass()) {
                    typeCount++;
                }
            }
            reString += uniqueTypes[i].getClass().getName() + "(" + typeCount + ")";
            if (i < uniqueCount - 1) {
                reString += ":";
            }
        }

        return reString;
    }

    public Set add(Object other) {
        if (!(other instanceof Set)) {
            return this;
        }
        Set s = (Set) other;
        int size = count + s.count;
        Object[] o = new Object[size];
        int index = 0;
        for (int i = 0; i < count; i++, index++) {
            o[index] = objects[i];
        }
        for (int i = 0; i < s.count; i++, index++) {
            o[index] = s.objects[i];
        }
        return new Set(size, o);
    }

    public void show() {
        // prints all items in the set
        for (int i = 0; i < count; i++) {
            System.out.print(" " + objects[i]);
        }
        System.out.println("");
    }

    public boolean helpSub(Object other) {
        for (int i = 0; i < count; i++) {
            if (other.equals(objects[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Set sub(Object other) {
        if (!(other instanceof Set)) {
            return this;
        }
        Set s = (Set) other;
        Object[] o = new Object[count];
        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (s.helpSub(objects[i])) {
                o[counter] = objects[i];
                counter++;
            }
        }
        if (o[0] == null) {
            return null;
        }
        return new Set(counter, o);
    }

    @Override
    public Arithmetic mul(Object other) {
        if (!(other instanceof Set)) {
            return null;
        }
        Set s = (Set) other;
        Object[] o = new Object[count + s.count];
        int counter = 0;

        for (int i = 0; i < count; i++) {
            if (!(s.helpSub(objects[i]))) {
                o[counter] = objects[i];
                counter++;
            }
        }

        if (o[0] == null) {
            return null;
        }
        return new Set(counter, o);
    }

    @Override
    public Arithmetic div(Object other) {
        return null;
    }

    public static void main(String[] args) {
        Set s = new Set(10, 1, 2, 3, 4, 5);
        s.show();
        System.out.println("next");
        Set se = new Set(10, 1, 3, 5, 6);
        se.show();
        System.out.println("after sum");
        System.out.println(s.sub(se));
    }
}
