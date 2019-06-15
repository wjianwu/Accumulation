package lint_code.str;

import java.util.Arrays;

/**
 * @author wjianwu 2019/6/4 15:14
 */
public class CountIll {

    private static int count(String s) {
        int count = 0;
        String[] ss = s.split("\\.");
        System.out.println(Arrays.toString(ss));
        System.out.println(ss.length);
        for (String s1 : ss) {
            s1 = s1.trim();
            char[] chars = s1.toCharArray();
            if (Character.isLowerCase(chars[0])) {
                count += 1;
            }
            for (int j = 1; j < chars.length; j++) {
                if (Character.isUpperCase(chars[j])) {
                    if (!" ".equals(chars[j - 1] + "") && !",".equals(chars[j - 1] + "")) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("WfaOIUZeTuQhIArgJuSgFufHBDoONlOVkKzXNwbDNXwD,EemZNuUovYHqKIaQBTZWUJinpNm,OX.DQPfHLNgedBUlGrHMgvoVw,sRicWxN.uNmULoHkMumuA mtemWcWPoUeZZdclZDYpbWY.OpAIBAVtJWfvTYzZtJowzcGizConWSUmZQHfnivsIedejNMtdiBTLfepfz,KTXTodw zNiIzFYSPuwPZLkhPkyvuxJinQHsPRfqDJGEECWhOiE.FCfexqGIpdlTTXgLvBxeUIuN.LPjQZCnH GJUlhCKDSZ"));
    }
}
