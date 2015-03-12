package lili.generic;

/**
 * Created by lili on 15/3/12.
 * 泛型无法向上转型
 */
public class GenericsDemo23 {
    public static void main(String args[]){
        Decent<String> i1 = new Decent<String>() ;      // 泛型类型为String
        Decent<Object> i2 = null ;
        //i2 = i1 ;                               //这句会出错 incompatible types
    }


}

class Decent<T>{
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
