package design_pattern.factory_pattern;

/**
 * @author wjianwu 2019/5/22 17:34
 */
public class OtherFactory implements AbstractFactory {
    @Override
    public Coffee createCoffee() {
        return new Coffee("Other");
    }

    @Override
    public Milk createMilk() {
        return new Milk("Other");
    }

    @Override
    public Tea createTea() {
        return new Tea("Other");
    }
}
