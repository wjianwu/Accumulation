package design_pattern.FactoryPattern;

/**
 * @author wjianwu 2019/5/22 17:27
 */
public interface AbstractFactory {

    Coffee createCoffee();

    Milk createMilk();

    Tea createTea();
}
