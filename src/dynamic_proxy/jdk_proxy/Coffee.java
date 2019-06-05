package dynamic_proxy.jdk_proxy;

/**
 * @author wjianwu 2019/5/24 17:44
 */
public class Coffee implements Drink {

    @Override
    public void drink() {
        System.out.println("drink Coffee");
    }

}
