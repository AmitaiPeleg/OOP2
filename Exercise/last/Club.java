package Exercise.last;

public class Club {
    private Person[] members;
    private int counter;
    String name;

    public Club(int c, String n) {
        name = n;
        counter = c;
    }

    public String toString() {
        String res = name;
        for (Person p : members) {
            res += p.toString() + ",";
        }
        return res;
    }

    public boolean equalss(Object o) {
        if (o instanceof Club) {
            return false;
        }
        Club c = (Club) o;
        int count = 0;
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < c.counter; j++) {
                if (members[i].equals(c.members[j])) {
                    count++;
                }
            }
        }
        return count > counter / 2 || count > c.counter / 2;
    }

    public Club clone() throws CloneNotSupportedException {
        Club c = this.clone();
        c.members = members.clone();
        for (int i = 0; i < counter; i++) {
            c.members[i] = members[i].clone();
        }
        return c;
    }
}
