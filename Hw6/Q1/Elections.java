package Hw6.Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Elections {
    public static int results(List<String> l, int hasima) {
        List<String> secondList = new ArrayList<>(l.size());
        for (String s : l) {
            secondList.add(s.toLowerCase());
        }
        HashMap<String, Integer> votes = new HashMap<>();
        for (String s : secondList) {
            if (votes.containsKey(s)) {
                votes.put(s, votes.get(s) + 1);
            } else {
                votes.put(s, 1);
            }
        }
        TreeMap<String, Integer> overHasima = new TreeMap<>();
        TreeMap<String, Integer> underHasima = new TreeMap<>();
        for (String s : votes.keySet()) {
            if (votes.get(s) >= hasima) {
                overHasima.put(s, votes.get(s));
            } else {
                underHasima.put(s, votes.get(s));
            }
        }
        System.out.println("Parties that did not pass Hasima are: ");
        for (String s : underHasima.keySet()) {
            System.out.println(s);
        }

        if (overHasima.size() == 0) {
            return 0;
        }
        System.out.println("Parties that did  pass Hasima are: ");
        for (String s : overHasima.keySet()) {
            System.out.println(s + ": " + overHasima.get(s));
        }
        int maxVotes = 0;
        String max = "";
        for (String s : overHasima.keySet()) {
            if (overHasima.get(s) > maxVotes) {
                maxVotes = overHasima.get(s);
                max = s;
            }
        }
        System.out.println("winner is: " + max);
        return overHasima.get(max);
    }

    public static void main(String[] args) {
        List<String> vots = Arrays.asList("BB", "BB", "Bb", "aA", "CCC", "aa", "cCc", "aa", "dddd", "bb", "bb");
        int x = results(vots, 2);
        System.out.println("x = " + x);
    }
}
