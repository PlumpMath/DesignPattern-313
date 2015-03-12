package lili.dp.other.delegate;

import java.lang.reflect.Method;

/**
 * Created by lili on 15/2/20.
 * 定义一个事件类
 */
public class Event {
    /*要执行方法的对象*/
    private Object object;
    //执行的方法
    private String methodName;
    //要执行方法的参数
    private Object[] params;
    //要执行的方法的参数类型
    private Class[] paramTypes;

    public Event(){

    }

    public Event(Object object,String methodName,Object...args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for(int i=0;i<params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public Object getObject() {
        return  object;
    }
    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = this.paramTypes;
    }
    public  void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.getMethodName(),
                this.getParamTypes());

        if(null==method){
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public String getMethodName() {
        return methodName;
    }

    public Object[] getParams() {
        return params;
    }
}
