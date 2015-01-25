package lili.dp.simple.abstractfactory;

/**
 * Created by lili on 15/1/25.
 */
public class ConcreteCreator2 implements Creator {
    @Override
    public ProductA factoryA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ConcreteProductB2();
    }
}
