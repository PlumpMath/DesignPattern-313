package lili.dp.simple.adapter;

/**
 * Created by lili on 15/1/28.
 */
public class Adapter implements Target {
    private Adaptee adaptee = null;

    @Override
    public void Request() {
        adaptee.SpecificRequest();

    }
}
