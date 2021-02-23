package algorithm.leecode.p202102;

import java.util.List;
import java.util.Vector;

class GFG {

    boolean isSubSequence(String str1, String str2) {
        int m = str1.length(), n = str2.length();

        int j = 0;

        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }

        return (j == m);
    }

    String findLongestWord(String str, List<String> dict) {
        String result = "";
        int length = 0;

        for (String word : dict) {

            if (length < word.length() &&
                isSubSequence(word, str)) {
                result = word;
                length = word.length();
            }
        }

        return result;
    }
}