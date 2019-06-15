package lint_code.str;

/**
 * @author wjianwu 2019/6/4 14:47
 */
public class StrSearchStr {

    private static int strStr(String source, String target) {
        StringBuilder sb = new StringBuilder(source);
        return sb.indexOf(target);
    }

    public static void main(String[] args) {
        System.out.println(strStr("agbxcdabcxdef", "bcd"));
    }
}
