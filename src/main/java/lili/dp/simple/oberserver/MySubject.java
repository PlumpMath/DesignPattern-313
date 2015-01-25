package lili.dp.simple.oberserver;

import lili.dp.simple.strategy.AbstractStrategy;

/**
 * Created by lili on 15/1/25.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!!!");
        notifyObservers();
    }
}
