package lint_code;

/**
 * @author wjianwu 2019/6/4 15:04
 */
public class IsUnique {

    private static boolean isUnique(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < chars.length; i++) {
            int index = sb.lastIndexOf(chars[i] + "");
            if (index != i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(isUnique("abgfdswrwfdsfac"));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
