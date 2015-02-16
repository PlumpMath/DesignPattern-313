package lili.dp.other;

/**
 * Created by liguofang on 2015/2/16.
 * A program that prints all combinations of a n letter word without using
 * recursion technique.
 * 非递归算法列出n个字母的排列组合
 * 1、首先计算出排列组合总个数
 * 2、开始移位
 */
public class ABCDCombinations {

	private void logic(String str) {
		char charArr[] = new char[str.length()];
		// convert into array 将字符转换为char数组
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = str.charAt(i);
		}

		// find total combinations 计算出排列组合的可能性
		int tc = 1;
		for (int i = 1; i <= charArr.length; i++) {
			tc = tc * i;
		}

		System.out.println("total combinations : " + tc);
		System.out.println("the original:"+str);

		int j = 0;
		for (int i = 0; i < tc - 1; i++) {

			char x = charArr[j + 1];
			charArr[j + 1] = charArr[j];
			charArr[j] = x;
			j++;

			if (j + 1 == charArr.length) {   //移动一轮后置零重新开始
				j = 0;
			}
			System.out.print(i + "=" );
			for (int k = 0; k < charArr.length; k++) {
				System.out.print(charArr[k]);
			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		new ABCDCombinations().logic("abc");

	}

}
