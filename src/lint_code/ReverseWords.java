package lint_code;

/**
 * @author wjianwu 2019/6/4 14:36
 */
public class ReverseWords {

    private static String reverseWords(String s) {
        s = s.trim();
        String[] ss = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(ss[i]);
            } else {
                sb.append(ss[i]).append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  Life  doesn't  always    give     us  the       joys we want."));
    }
}
