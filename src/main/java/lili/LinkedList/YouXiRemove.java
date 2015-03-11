package lili.LinkedList;

import java.util.LinkedList;

/**
 * Created by lili on 2015/3/11.
 * 50个人围成一圈数到三和三的倍数时出圈，问剩下的人是谁？在原来的位置是多少？
 */
public class YouXiRemove {

	public static int removeNM(int n, int m) {
		LinkedList ll = new LinkedList();
		for (int i = 0; i < n; i++)
			ll.add(new Integer(i + 1));
		int removed = -1;
		while (ll.size() > 1) {
			removed = (removed + m) % ll.size(); //% 取余运算符
			System.out.println("removed:" + removed);
			ll.remove(removed--);      //linkedlist从0下标对应的人是1
		}
		return ((Integer) ll.get(0)).intValue();
	}

	public static void main(String[] args) {
		System.out.println("the left:" + removeNM(50, 3));
	}
}
