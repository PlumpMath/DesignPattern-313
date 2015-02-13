package lili.dp.simple.oberserver.listenerpattern;

/**
 * Created by liguofang on 2015/2/13.
 */
public class MyCreateEventImpl implements MyEvent {
	private String type="";
	public MyCreateEventImpl(){
		this.type = MyEvent.createEvent;
	}
	public String getEvent() {
		return this.type;
	}
}
