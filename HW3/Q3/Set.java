package HW3.Q3;

import HW3.Q1.Arithmetic;

public class Set implements Arithmetic, ScanOp {
    private Object[] objects;
    private int count = 0;
    private int currentIndex = 0;

    public Set(int size, Object... o) {
        objects = new Object[size];
        for (Object x : o) {
            
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

    public Object[] getArrayClass(Class c) {
        int size = 0;
        for (int j = 0; j < count; j++) {
            if (objects[j].getClass() == c) {
                size++;
            }
        }
        Object[] o = new Object[size];
        int counter = 0;
        for (int i = 0; i < count; i++) {
            if (objects[i].getClass() == c) {
                o[counter] = objects[i];
                counter++;
            }
        }
        return o;
    }

    public Class[] getAllClass() {
        Class[] start = new Class[count];
        Class[] result;
        boolean a = true;
        int counter = 0;
        int size = 0;
        for (int i = 0; i < count; i++) {
            start[i] = objects[i].getClass();
        }
        for (int j = 0; j < start.length; j++) {
            a = true;
            for (int z = j + 1; z < start.length; z++) {
                if (start[j] == start[z]) {
                    a = false;
                    break;
                }
            }
            if (a) {
                size++;
            }
        }
        result = new Class[size];
        for (int r = 0; r < start.length; r++) {
            a = true;
            for (int c = r + 1; c < start.length; c++) {
                if (start[r] == start[c]) {
                    a = false;
                    break;
                }
            }
            if (a) {
                result[counter] = start[r];
                counter++;
            }
        }
        return result;
    }

    @Override
    public void reset() {
        currentIndex = 0;
    }

    @Override
    public boolean forward() {
        if (currentIndex < count-1) {
            currentIndex++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean backward() {
        if (currentIndex > 0) {
            currentIndex--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object getCurrent() {
        return objects[currentIndex];
    }
}
