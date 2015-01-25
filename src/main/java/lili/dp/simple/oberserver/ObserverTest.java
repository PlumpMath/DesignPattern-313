package lili.dp.simple.oberserver;

/**
 * Created by lili on 15/1/25.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
