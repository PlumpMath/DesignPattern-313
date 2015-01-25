package lili.dp.simple.strategy;

/**
 * Created by lili on 15/1/25.
 */
public class ConcreteStrategy1 extends AbstractStrategy {
    @Override
    public void algorithm(Context context) {
        System.out.println("---------这是策略1-算法实现");
    }
}
