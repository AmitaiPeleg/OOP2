package HW3.Q3;

public class Set {
    private Object[] objects;
    int count = 0;

    public Set(int size, Object... o) {
        boolean a = true;
        objects = new Object[size];
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < count; j++) {
                if (o[i].equals(objects[j])) {
                    a = false;
                    break;
                }
                if (a) {
                    objects[count] = o[i];
                    count++;
                    break;
                }
            }
        }
    }

    public String toString() {
        boolean a = true;
        int counter = 0;
        Object[] s;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (objects[i].getClass() == objects[j].getClass()) {
                    a = false;
                    break;
                }
            }
            if (a) {
                counter++;
            }
            a = true;
        }
        s = new Object[counter];
        int c = 0;
        for (int z = 0; z < count; z++) {
            for (int k = z + 1; k < count; k++) {
                if (objects[z].getClass() == objects[k].getClass()) {
                    a = false;
                    break;
                }
            }
            if (a) {
                s[c] = objects[z];
                c++;
            }
            a = true;
        }
        int[] counts = new int[counter];
        for (int x = 0; x < counter; x++) {
            for (int f = 0; f < count; f++) {
                if (s[x].getClass() == objects[f].getClass()) {
                    counts[x]++;
                }
            }
        }
        String[] result = new String[counter];
        for (int d = 0; d < counter - 1; d++) {
            result[d] = s[d].getClass().getName() + "(" + counts[d] + "):";
        }
        result[counter - 1] = s[counter - 1].getClass().getName() + "(" + counts[counter - 1] + ")";
        String reString = "";
        for (int w = 0; w < counter; w++) {
            reString += result[w];
        }
        return reString;
    }
}
