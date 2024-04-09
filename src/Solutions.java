import java.util.ArrayList;
import java.util.List;

public class Solutions {
    public int countOccurance(List<String> wordList, String targetWord) {
        int count = 0;

        for (String word : wordList) {
            if (word.equals(targetWord)) {
                count += 1;
            }
        }
        return count;
    }

    public List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public List<Integer> findUnique(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer num : nums) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }

    public void calcOccurrence(List<String> wordList) {
        int[] wordCount = new int[wordList.size()];

        for (int i = 0; i < wordCount.length; i += 1) {
            wordCount[i] = 0;
        }

        for (int i = 0; i < wordList.size(); i += 1) {
            String word = wordList.get(i);
            wordCount[i] += 1;

            for (int j = i + 1; j < wordList.size(); j += 1) {
                if (word.equals(wordList.get(j))) {
                    wordCount[i] += 1;
                    wordList.remove(j);
                    j -= 1;
                }
            }
        }

        for (int i = 0; i < wordList.size(); i += 1) {
            System.out.println(wordList.get(i) + ": " + wordCount[i]);
        }
    }
}

