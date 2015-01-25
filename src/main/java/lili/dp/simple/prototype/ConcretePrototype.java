package lili.dp.simple.prototype;

/**
 * Created by lili on 15/1/25.
 */
public class ConcretePrototype implements Prototype {

    public synchronized Object clone() {
        Prototype temp = null;
        try {
            temp = (Prototype) super.clone();
            return temp;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Clone failed");
        }finally {
            return temp;
        }

    }

}
