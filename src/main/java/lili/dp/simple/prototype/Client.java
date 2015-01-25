package lili.dp.simple.prototype;

/**
 * Created by lili on 15/1/25.
 */
public class Client {
    private PrototypeManager manager;
    private Prototype prototype;
    public void registerPrototype() {
        prototype = new ConcretePrototype();
        Prototype copytype = (Prototype) prototype.clone();
        manager.add(copytype);
    }

}
