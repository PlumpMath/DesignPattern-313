package lili.interview.linkedin;

import java.util.concurrent.DelayQueue;

/**
 * Created by liguofang on 2015/2/16.
 */

public class Server {

	private DelayQueue<Job> queue;

	public Server(DelayQueue<Job> queue) {
		this.queue = queue;
	}

	public void processTasks() {
		while(!Thread.interrupted()) {
			try {
				queue.take().job().run();
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
