package lili.dp.simple.oberserver.listenerpattern;

/**
 * Created by liguofang on 2015/2/13.
 *  1、首先要定义事件，监听器处理哪些类型的事件，
 *  也就是用什么样的事件来触发监听器，事件的类型很多，
 *  这里可以定义一个事件接口来抽象所有事件类型。
 */
public interface MyEvent {
	/**
	 * 事件接口，其中事件的类型定义了三种，创建、删除、更新
	 */
	public static final String createEvent = "CREATE_EVENT";
	public static final String deleteEvent = "DELETE_EVENT";
	public static final String updateEvent = "UPDATE_EVENT";

	public  String getEvent();

}
