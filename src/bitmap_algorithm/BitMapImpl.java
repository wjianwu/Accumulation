package bitmap_algorithm;

/**
 * @author wjianwu 2019/5/13 17:49
 */
public class BitMapImpl {

    public static final int MAX_NUMBER = 100_0; // 亿

    private int[] NEED_SPACE = new int[MAX_NUMBER / 32 + 1]; // 所需空间

    /**
     * 10 A 11 B 12 C 13 D 14 E 15 F
     * 0x1F = 15
     * num & 11111 = ...10110011..01110 & ...00000000..11111 = 01110 = 余数
     * 01110 = 12
     * 1 << 12 = 000000000001 << 12
     * ...000100000000000 | a[row] = 将 a[row] 位置上第 index 位置为 1
     */
    public void addNumber(int num) {
        if (num > MAX_NUMBER || num < 0) {
            System.out.println("超过范围");
            return;
        }
        int row = num / 32; // 所在int的下标
        int index = num & 0x1F; // 在该int的第几位
        NEED_SPACE[row] |= 1 << index; // 位置置 1
    }

    public void removeNumber(int num) {
        if (num > MAX_NUMBER || num < 0) {
            System.out.println("超过范围");
            return;
        }
        int row = num / 32;
        int index = num & 0x1F;
        NEED_SPACE[row] &= ~(1 << index);
    }

    public boolean isExist(int num) {
        int row = num / 32;
        int index = num & 0x1F;
        return (NEED_SPACE[row] &= 1 << index) != 0;
    }

    public static void main(String[] args) {
        BitMapImpl bmi = new BitMapImpl();
        bmi.addNumber(13);
        bmi.addNumber(79);
        bmi.addNumber(32);
        System.out.println(bmi.isExist(13));
        System.out.println(bmi.isExist(79));
        System.out.println(bmi.isExist(32));
        bmi.removeNumber(79);
        System.out.println(bmi.isExist(13));
        System.out.println(bmi.isExist(79));
        System.out.println(bmi.isExist(32));
    }
}
