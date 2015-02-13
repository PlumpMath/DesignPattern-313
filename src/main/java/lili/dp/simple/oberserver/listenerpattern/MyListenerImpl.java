package lili.dp.simple.oberserver.listenerpattern;

/**
 * Created by liguofang on 2015/2/13.
 */
public class MyListenerImpl implements MyListener {
	public void handle(MyEvent myEvent) {
		if(myEvent.getEvent().equals("CREATE_EVENT")){
			System.out.println("myListener get a create event!");
		}
		else if(myEvent.getEvent().equals("DELETE_EVENT")){
			System.out.println("myListener get a DELETE_EVENT event!");
		}

	}
}