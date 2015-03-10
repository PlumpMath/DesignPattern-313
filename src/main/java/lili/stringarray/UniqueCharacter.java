package lili.stringarray;

/**
 * 实现一个算法来判断一个string总是否包含所有的唯一字符
 * 假如你不用使用其他的数据结构
 * Implement an algorithm to determine if a string has all unique characters.What if
 you can not use additional data structures?
 * Created by lili on 2015/3/10.
 */
public class UniqueCharacter {

	public static void main(String[] args)
	{
//		非运算符用符号“~”表示，其运算规律如下 如果位为0，结果是1，如果位为1，结果是0，下面看一个简单例子。
		int a =2;
		System.out.println("a 非的结果是：" + (~a));
	}

	/**
	 * 假设charset is ASCII
	 * 算法复杂度和空间复杂度为O(n)，n为string的长度
	 * @param string
	 * @return
	 */
	public static boolean isUniqueChars2(String string) {
		boolean[] char_set = new boolean[256];
		for (int i =0; i <string.length(); i++) {
			int val =string.charAt(i);
			if (char_set[val]) return false;    //如果已经存在的则返回false
			char_set[val] = true;               //遍历到的设置为true;
		}
		return true;
	}

	/**
	 * x<<y 相当于 x*2y ；x>>y相当于x/2y
	 * 我们假设都是小写'a'到‘z' 运行我们只使用single int
	 * bit vector
	 * @param string
	 * @return
	 */
	public static boolean isUniqueChars(String string) {
		int checker = 0;
		for (int i = 0; i <string.length(); ++i) {
			int val = string.charAt(i) -'a';
			if ((checker &(1<<val)) >0) return false; //按位与，两个操作数中位都为1，结果才为1，否则结果为0
			checker |= (1<<val);  //a和b按位或然后赋值给a   按位或的意思就是先把a和b都换成2进制，然后用或操作
		}
		return true;
	}

}
