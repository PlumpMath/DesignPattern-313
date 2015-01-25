package lili.dp.simple.prototype;

import java.io.*;

/**
 * Created by lili on 15/1/25.
 * 深浅复制的例子
 */
public class DeepClonePrototype implements Prototype ,Serializable{

    private String string;
    private SerializableObject obj;

    /* 浅复制 */
    public Object shallowClone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /* 深复制 */
    public Object clone() {

        try {
        /* 写入当前对象的二进制流 */
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

}

class  SerializableObject  implements Serializable {

}