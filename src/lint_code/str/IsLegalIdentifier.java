package lint_code.str;

/**
 * @author wjianwu 2019/6/4 17:06
 */
public class IsLegalIdentifier {

    public static boolean isLegalIdentifier(String str) {
        return "".matches("[A-Za-z_][A-Za-z0-9_]*");
    }

    public static void main(String[] args) {
        System.out.println(isLegalIdentifier("LintCode"));
    }
}
