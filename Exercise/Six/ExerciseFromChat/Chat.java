package Exercise.Six.ExerciseFromChat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Chat {
    List<String> names = new ArrayList<>();

    public void Chats() {
        names.add("Aliam");
        names.add("Noa");
        names.add("Eden");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.charAt(0) == 'A') {
                it.remove();
            }
        }
    }
}