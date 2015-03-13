package lili.hex;

/**
 * Created by lili on 2015/3/13.
 * 不要使用 i % 2 == 1 来判断是否是奇数，因为i为负奇数时不成立，请使用 i % 2 != 0 来判断是否是奇数，或使用
 * 高效式 (i & 1) != 0来判断。
 */
public class TestOdd {

	public static void main(String args[]) {
		int i = 3;
		boolean b = (i&1)==0 ;    //非常高效的判断是否偶数
		//3:0011,1:0001,两个& = 0001，不为零，则是奇数
		System.out.println("是否为偶数：" +b);
		System.out.println("整数最大值：" + Integer.MAX_VALUE);
		System.out.println("整数最小值：" + Integer.MIN_VALUE);
		System.out.println("Short最大值：" + Short.MAX_VALUE);
		System.out.println("Short最小值：" + Short.MIN_VALUE);
		System.out.println("Byte 最大值：" + Byte.MAX_VALUE);
		System.out.println("Byte 最小值：" + Byte.MIN_VALUE);


		/*
		* 当使用+=、-=、*=、/=、%=、运算符对基本类型进行运算时，遵循如下规则：
        * 运算符右边的数值将首先被强制转换成与运算符左边数值相同的类型，然后再执行运算，
        * 且运算结果与运算符左边数值类型相同。
		* */
		short s1=1;   //正确，int赋值给short  ，以左边的类型为主
//			s1=s1+1;         因为s1+1 结果int，转换为short，
		s1+=1;//正确，1首先被强制转换为short型，然后再参与运算，并且结果也是short类型

	}
}
