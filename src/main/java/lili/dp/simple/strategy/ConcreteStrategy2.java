package lili.dp.simple.strategy;

/**
 * Created by lili on 15/1/25.
 */
public class ConcreteStrategy2 extends AbstractStrategy {
    @Override
    public void algorithm(Context context) {
        System.out.println("----------------我是策略二算法----------------");
        System.out.println("------------------我需要的参数parameter1="+context.getParameter1());
        System.out.println("------------------我需要的参数parameter2="+context.getParameter2());
        System.out.println("---------这是策略2-算法实现");
    }
}
