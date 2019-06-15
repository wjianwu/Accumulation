package design_pattern.factory_pattern;

/**
 * @author wjianwu 2019/5/22 17:33
 */
public class ChinaFactory implements AbstractFactory {

    @Override
    public Coffee createCoffee() {
        return new Coffee("China");
    }

    @Override
    public Milk createMilk() {
        return new Milk("China");
    }

    @Override
    public Tea createTea() {
        return new Tea("China");
    }
}
