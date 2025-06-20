package Exercise;

import java.util.*;

public class Gvul {
    public static boolean Gvuls(Map<String, Set<String>> m) {
        for (String country : m.keySet()) {

        }
    }

    public static void main(String[] args) {
        Map<String, Set<String>> map = new HashMap<>();

        map.put("Israel", new HashSet<>(Arrays.asList("Lebanon", "Syria")));
        map.put("Syria", new HashSet<>(Arrays.asList("Iraq", "Lebanon")));
        map.put("Lebanon", new HashSet<>(Arrays.asList("Syria", "Israel")));
        map.put("Iraq", new HashSet<>(Collections.singletonList("Syria")));
        System.out.println(Gvuls(map));
    }
}
