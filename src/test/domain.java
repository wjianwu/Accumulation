package test;

import java.util.Arrays;
import java.util.List;

/**
 * @author wjianwu 2019/6/3 10:10
 */
public class domain {

    public static void main(String[] args) {
        List yourEnums = Arrays.asList(KeywordEffect.values());
        yourEnums.add("NaN");
        System.out.println(yourEnums);
    }
}
