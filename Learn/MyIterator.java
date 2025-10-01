package Learn;

import java.util.Iterator;

public class MyIterator implements Iterator<Patient> {
    private Patient[] ps;
    private int count;

    public MyIterator(Patient[] p, int c) {
        ps = p;
        count = c;
    }

    public boolean hasNext() {
        return ps.length>0;
    }

    public Patient next() {
        if (!hasNext()) {
            throw new RuntimeException("has no next");
        }
        Patient[] newps = new Patient[ps.length - 1];
        Patient most = ps[0];
        for (int i = 0; i < count; i++) {
            if (ps[i].compareTo(most) == 1) {
                most = ps[i];
            }}
            int countfornew = 0;
            for (int j = 0; j < count; j++) {
                if (!(ps[j].equals(most))) {
                    newps[countfornew] = ps[j];
                    countfornew++;
                }
            }
ps = newps;
return most;
        }
    }

