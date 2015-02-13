package lili.dp.simple.oberserver.listenerpattern;

/**
 * Created by liguofang on 2015/2/13.
 * 基础工作都做好后，就可以在想添加监听的类中实施监听功能了。
 */
public class MyCreateAction {
	//引入监听器
	private MyListener myListener;
	//引入事件，用来传给Listener进行处理
	private static MyEvent myEvent;
	public void setListener(MyListener myListener){
		this.myListener = myListener;
	}
	private void handleListener(MyEvent myEvent){
		//触发监听
		this.myListener.handle(myEvent);
	}
	public void execute(){
		//设置事件的类型为create
		myEvent = new MyCreateEventImpl();
		System.out.println("create start!");
		this.handleListener(myEvent);
		System.out.println("create end!");
	}

	//调用被监听的类，测试监听效果
	public static void main(String[] args) {
		MyCreateAction action = new MyCreateAction();
		MyListenerImpl myListener = new MyListenerImpl();
		//设置监听器的实现
		action.setListener(myListener);
		action.execute();
	}
}