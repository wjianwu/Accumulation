package design_pattern.FactoryPattern;

/**
 * @author wjianwu 2019/5/22 17:41
 */
public class DoMain {

    public static void main(String[] args) {
        AbstractFactory chinaFactory = new ChinaFactory();
        chinaFactory.createCoffee();
        chinaFactory.createMilk();
        chinaFactory.createTea();

        AbstractFactory otherFactory = new OtherFactory();
        otherFactory.createCoffee();
        otherFactory.createMilk();
        otherFactory.createTea();
    }
}
