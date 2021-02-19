package algorithm.leecode.p202102;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LetterCaseClass {

    public List<String> letterCasePermutation(String value) {
        char[] chars = value.toCharArray();

        int countCharacter = 0;
        for (int index = 0; index < chars.length; index++) {
            countCharacter = Character.isAlphabetic(Character.codePointAt(value, index)) ? countCharacter + 1 : countCharacter;
        }

        List<String> result = new ArrayList<>();
        double count = Math.pow(2, countCharacter);
        for (int loop = 0; loop < count; loop ++) {
            StringBuilder stringBuilder = new StringBuilder(Integer.toBinaryString(loop));
            char[] bitArr = stringBuilder.reverse().toString().toCharArray();
            String str = convert(value, bitArr);
            result.add(str);
        }

        return result;
    }

    private String convert(String str, char[] bitArr) {

        char[] convertArr = str.toCharArray();

        int cursor = 0;
        for (int index = 0; index < convertArr.length; index ++) {
            if (cursor < bitArr.length) {
                if (Character.isUpperCase(convertArr[index])) {
                    if (bitArr[cursor] == '1') {
                        convertArr[index] = Character.toLowerCase(convertArr[index]);
                    }
                    cursor ++;
                } else if (Character.isLowerCase(convertArr[index])) {
                    if (bitArr[cursor] == '1') {
                        convertArr[index] = Character.toUpperCase(convertArr[index]);
                    }
                    cursor ++;
                }
            }
        }

        return new String(convertArr);
    }


    @Test
    public void test1() {
        letterCasePermutation("ab1c");
    }

}
