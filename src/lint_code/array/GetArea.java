package lint_code.array;

import java.text.DecimalFormat;

/**
 * @author wjianwu 2019/6/4 14:31
 */
public class GetArea {

    private static double getArea(double r) {
        double pi = 3.14;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String result = decimalFormat.format(pi * r * r);
        return Double.parseDouble(result);
    }

    public static void main(String[] args) {
        System.out.println(getArea(1));
    }
}
