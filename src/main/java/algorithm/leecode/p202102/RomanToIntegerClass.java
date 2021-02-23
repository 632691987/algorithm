package algorithm.leecode.p202102;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerClass {

    private static Map<String, Integer> mapping;

    static {
        mapping = new HashMap<>();
        mapping.put("I", 1);
        mapping.put("V", 5);
        mapping.put("X", 10);
        mapping.put("L", 50);
        mapping.put("C", 100);
        mapping.put("D", 500);
        mapping.put("M", 1000);

        mapping.put("IV", 4);
        mapping.put("IX", 9);

        mapping.put("XL", 40);
        mapping.put("XC", 90);

        mapping.put("CD", 400);
        mapping.put("CM", 900);
    }

    public int romanToInt(String s) {
        char[] sArray = s.toCharArray();
        int cursor = 0;
        int count = 0;
        while (cursor < s.length()) {
            if (sArray[cursor] == 'I' || sArray[cursor] == 'X' || sArray[cursor] == 'C') {
                if (cursor + 1 != s.length()) {
                    String temp = s.substring(cursor, cursor + 2);
                    if (mapping.containsKey(temp)) {
                        count += mapping.get(temp);
                        cursor = cursor + 2;
                        continue;
                    }
                }
            }
            String temp = String.valueOf(sArray[cursor]);
            count += mapping.get(temp);
            cursor = cursor + 1;
        }
        return count;
    }
}
