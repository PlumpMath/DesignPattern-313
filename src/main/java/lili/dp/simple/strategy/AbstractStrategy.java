package lili.dp.simple.strategy;

/**
 * Created by lili on 15/1/25.
 * 抽象策略
 */
public abstract class AbstractStrategy {
    /**
     * 某个希望有不同策略实现的算法
     */
    public abstract void algorithm(Context context);

}
