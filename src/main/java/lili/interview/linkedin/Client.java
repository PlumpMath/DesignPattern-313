package lili.interview.linkedin;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by liguofang on 2015/2/16.
 */

public class Client {

	private DelayQueue<Job> queue;

	public Client(DelayQueue<Job> queue) {
		this.queue = queue;
	}

	public void addTask(Runnable job, long delay, TimeUnit timeUnit) {
		queue.put(new Job(job, delay, timeUnit));
	}

}

