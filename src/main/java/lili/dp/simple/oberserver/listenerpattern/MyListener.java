package lili.dp.simple.oberserver.listenerpattern;

/**
 * Created by liguofang on 2015/2/13.
 *
 * 定义监听器，该监听器只监听MyEvent类型的事件
 */
public interface MyListener {
	public void handle(MyEvent myEvent);
}
