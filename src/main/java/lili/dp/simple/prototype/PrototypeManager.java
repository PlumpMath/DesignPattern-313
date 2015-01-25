package lili.dp.simple.prototype;

import java.util.Vector;

/**
 * Created by lili on 15/1/25.
 */
public class PrototypeManager {
    private Vector objects = new Vector();

    public void add(Prototype object) {
        objects.add(object);
    }
    public Prototype get(int i) {
        return (Prototype) objects.get(i);
    }
    public int getSize() {
        return  objects.size();
    }
}
