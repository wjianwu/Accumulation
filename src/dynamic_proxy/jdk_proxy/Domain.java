package dynamic_proxy.jdk_proxy;

/**
 * @author wjianwu 2019/5/24 17:54
 */
public class Domain {

    public static void main(String[] args) {
        ProxyDrink proxyDrink = new ProxyDrink();
        Coffee coffee = new Coffee();
        Drink o = (Drink) proxyDrink.bind(coffee);
        o.drink();
    }

}
