package lili.dp.simple.strategy;

/**
 * Created by lili on 15/1/25.
 * 策略模式客户端测试类
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.algorithm();

        context = new Context(new ConcreteStrategy2(),100, 200);
        context.algorithm();

        context = new Context(new ConcreteStrategy3(), 100, 200);
        context.algorithm();
    }

}
