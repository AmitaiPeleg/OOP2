package Hw6.Q3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Program {
    public static HashMap<Object, Integer> calcfreq(Collection<Object> c) {
        HashMap<Object, Integer> result = new HashMap<>();
        for (Object o : c) {
            if (result.containsKey(o)) {
                result.put(o, result.get(o) + 1);
            } else {
                result.put(o, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(2);
        Collection<Object> c2 = new LinkedList<>();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("a");
        HashMap<Object, Integer> m1 = calcfreq(c);
        Map<Object, Integer> m2 = calcfreq(c2);
        for (Map.Entry<Object, Integer> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for (Map.Entry<Object, Integer> entry : m2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
