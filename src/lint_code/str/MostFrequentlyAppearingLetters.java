package lint_code.str;

import java.util.*;

/**
 * @author wjianwu 2019/6/4 16:49
 */
public class MostFrequentlyAppearingLetters {

    private static int mostFrequentlyAppearingLetters(String str) {
        char[] chars = str.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.put(aChar + "", map.get(aChar + "") == null ? 1 : map.get(aChar + "") + 1);
        }
        Object[] arr = map.values().toArray();
        int result = 0;
        for (Object anArr : arr) {
            if ((Integer) anArr > result) {
                result = (Integer) anArr;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentlyAppearingLetters("ABCabcA"));
    }
}
