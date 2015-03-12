package lili.generic;

/**
 * Created by lili on 15/3/12.
 */
public class GenericsDemo17 {


    public static void main(String args[]){
        System.out.println("Number 类型的泛型----");
        INFOS<Integer> i1 = new INFOS<Integer>() ;        // 声明Integer的泛型对象
        INFOS<Float> i2 = new INFOS<Float>() ;            // 声明Float的泛型对象
        i1.setVar(30) ;                                 // 设置整数，自动装箱
        i2.setVar(30.1f) ;                              // 设置小数，自动装箱
        fun(i1) ;
        fun(i2) ;
        System.out.println("String 类型的泛型----");
        INFOS<String> s1 = new INFOS<String>() ;      // 声明String的泛型对象
        INFOS<Object> s2 = new INFOS<Object>() ;      // 声明Object的泛型对象
        s1.setVar("hello") ;
        s2.setVar(new Object()) ;
        funs(s1) ;
        funs(s2) ;
    }
    public static void fun(INFOS<? extends Number> temp){  // 只能接收Number及其Number的子类
        System.out.print(temp + " 、 ") ;
    }

    public static void funs(INFOS<? super String> temp){    // 只能接收String或Object类型的泛型
        System.out.print(temp + " 、 ") ;
    }

}

class INFOS<T>{
    private T var ;     // 定义泛型变量
    public void setVar(T var){
        this.var = var ;
    }
    public T getVar(){
        return this.var ;
    }
    public String toString(){   // 直接打印
        return this.var.toString() ;
    }
}


