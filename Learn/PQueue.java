package Learn;

public class PQueue {
    private Patient[] ps;
    private int counter; // number of patients

    public PQueue(int n) {
        ps = new Patient[n];
    }

    public void add(Patient p) {
        if (counter < ps.length) {
            ps[counter] = p;
            counter++;
        }
    }

    public String toString() {
        String ans = "[";
        for (int i = 0; i < counter; i++) {
            ans += ps[i].toString();
            if (i != counter - 1) {
                ans += ",";
            }
        }
        ans+="]";
        return ans;
    }
    
}