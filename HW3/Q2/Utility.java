package HW3.Q2;

class Utility {
    public static void showAll(Showable[] a) {
        for (Showable s : a) {
            s.show();
        }
    }

    public static void showAll(Object[] a) {
        for (Object o : a) {
            if (o instanceof Showable) {
                ((Showable) o).show();
            } else {
                o.toString();
            }
        }
    }

    public static boolean search(Object[] a, Object o) {
        for (Object other : a) {
            if (other instanceof Comparable) {

                if (((Comparable) other).compareTo(o) == 0) {
                    return true;
                }
            } else {
                if (other.equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object max(Object[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].getClass() != a[i + 1].getClass()) {
                return null;
            }
        }
        if (!(a[0] instanceof Comparable)) {
            return null;
        }
        Object max = a[0];
        for (int j = 1; j < a.length; j++) {
            if (((Comparable) a[j]).compareTo(max) == -1) {
                a[j] = max;
            }
        }
        return max;
    }
}