package Exercise.Six.ExerciseFromChat;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Chat {
    public static void printWinner(String[] people) {
        HashMap<String, Integer> m = new HashMap<>();
        for (String s : people) {
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        int maxVotes = -1;
        String winner = "";
        for (Map.Entry<String, Integer> t : m.entrySet()) {
            if (t.getValue() > maxVotes) {
                winner = t.getKey();
                maxVotes = t.getValue();
            }
        }
        System.out.println(winner + "(" + maxVotes + ")");
    }
}