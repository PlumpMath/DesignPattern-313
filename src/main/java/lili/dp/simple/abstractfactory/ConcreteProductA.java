package lili.dp.simple.abstractfactory;

/**
 * Created by lili on 15/1/25.
 */
public class ConcreteProductA implements ProductA {
    public ConcreteProductA() {
        System.out.println(this.getClass().toString());
    }
}
