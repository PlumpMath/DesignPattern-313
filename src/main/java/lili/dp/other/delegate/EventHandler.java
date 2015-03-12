package lili.dp.other.delegate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lili on 15/2/20.
 * 若干Event类的载体，同时提供一个执行所有Event的方法
 */
public class EventHandler {
    //存放event类的载体
    private List<Event> objects;
    public  EventHandler() {
        objects = new ArrayList<Event>();
    }

    /**
     * 添加某个对象要执行的事件，及需要的参数
     * @param object
     * @param methodName
     * @param args
     */
    public void addEvent(Object object, String methodName,
                         Object...args) {
        objects.add(new Event(object,methodName,args));
    }

    /**
     * 通知所有的对象执行指定的事件
     * @throws Exception
     */
    public void notifyX() throws  Exception{
        for(Event e:objects) {
            e.invoke();
        }
    }
}
