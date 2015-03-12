package lili.generic;

/**
 * Created by lili on 15/3/12.
 *
 * 泛型接口
 */
public class GenericsDemo24 {
    public static void main(String arsg[]){
        Msg<String> i = null;        // 声明接口对象
        i = new MsgImpl<String>("汤姆") ;  // 通过子类实例化对象
        System.out.println("内容：" + i.getVar()) ;

        Msg msg = null;      // 声明接口对象
        msg = new MsgImpl("汤姆") ;    // 通过子类实例化对象
        System.out.println("内容：" + i.getVar()) ;
    }


}

interface Msg<T> { //在接口上定义泛型
    public T getVar(); //定义抽象方法；抽象方法的返回值就是泛型类型
}
class MsgImpl<T> implements Msg<T>{   // 定义泛型接口的子类
    private T var ;             // 定义属性
    public MsgImpl(T var){     // 通过构造方法设置属性内容
        this.setVar(var) ;
    }
    public void setVar(T var){
        this.var = var ;
    }
    public T getVar(){
        return this.var ;
    }
};
