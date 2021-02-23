package algorithm.leecode.p202102;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindLongestWordClass {

    public String findLongestWord(String target, List<String> words) {
        List<String> satisfiedList = new ArrayList<>();

        for (int index = 0; index < words.size(); index++) {
            String word = words.get(index);
            int[] targetMapping = getCharMapping(target);

            boolean isSatisfied = true;

            for (int loop = 0; loop < word.length(); loop ++) {
                targetMapping[word.charAt(loop) - 'a']--;
                if (targetMapping[word.charAt(loop) - 'a'] < 0) {
                    isSatisfied = false;
                    break;
                }
            }

            if (isSatisfied) {
                satisfiedList.add(word);
            }

        }

        satisfiedList.sort((str1, str2) -> {
            int length1 = str1.length();
            int length2 = str2.length();

            return length1 != length2 ? length2 - length1 : str1.compareTo(str2);
        });

        return satisfiedList.size() == 0 ? "" : satisfiedList.get(0);
    }

    private int[] getCharMapping(String target) {
        char[] chars = target.toCharArray();
        int[] charMapping = new int[26];
        for (char c : chars) {
            charMapping[c - 'a'] = charMapping[c - 'a'] + 1;
        }
        return charMapping;
    }

    @Test
    public void test1() {
        String target = "abcdefg";

        List<String> words = new ArrayList<>();
        words.add("abcdef");

        System.out.println(findLongestWord(target, words));
    }

}
