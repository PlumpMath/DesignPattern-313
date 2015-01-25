package lili.dp.simple.abstractfactory;

/**
 * Created by lili on 15/1/25.
 */
public class ConcreteCreator1 implements Creator {
    @Override
    public ProductA factoryA() {
        return new ConcreteProductA();
    }

    @Override
    public ProductB factoryB() {
        return new ConcreteProductB();
    }
}
