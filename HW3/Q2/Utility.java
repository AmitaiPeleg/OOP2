package HW3.Q2;

class Utility {
    public static void showAll(Showable[] a) {
        if (a.length == 0) {
            return;
        }
        for (Showable s : a) {
            if (s != null) {
                s.show();
            }
        }
    }

    public static void showAll(Object[] a) {
        for (Object o : a) {
            if (o instanceof Showable) {
                ((Showable) o).show();
            } else {
                System.out.println(o.toString());

            }
        }
    }

    public static boolean search(Object[] a, Object o) {
        if (a.length == 0 || o == null) {
            return false;
        }
        
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
        if (a.length == 0) {
            return null;
        }
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
                max = a[j];
            }
        }
        return max;
    }
}