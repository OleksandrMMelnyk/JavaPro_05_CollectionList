package Task5;

import java.util.ArrayList;
import java.util.List;

public class Occurrences {

    public List<ObjectOccurrence> findOccurrences (List<String> words) {
        List<ObjectOccurrence> occurrences = new ArrayList<>();

        for (String word: words) {
            boolean found = false;
            for (ObjectOccurrence object: occurrences) {
                if (word.equals(object.getName())) {
                    object.incrementOccurrence();
                    found = true;
                    break;
                }
            }
            if (!found) {
                occurrences.add(new ObjectOccurrence(word));
            }
        }
        return occurrences;
    }
}
