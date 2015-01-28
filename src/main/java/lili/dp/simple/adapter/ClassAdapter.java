package lili.dp.simple.adapter;

/**
 * Created by lili on 15/1/28.
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void Request() {
        super.SpecificRequest();
    }
}
