package lili.stringarray;

/**
 * Created by lili on 2015/3/10.
 * Write a method to replace all spaces in a string with ‘%20’.
 *
 */
public class ReplaceStr {

	/**
	 * 这个替换的有点问题，length参数不知道是说明什么的
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
		String str = "I love U";
		ReplaceFun(str.toCharArray(),5);//str.length());
	}

	public  static void ReplaceFun(char[] str, int length) {
		int spaceCount = 0, newLength, i = 0;
		for ( i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		newLength = length +spaceCount *2;
		//str = new char[newLength+1];
		//str[newLength] = '\0';  //空格 ' '
		for (i = length -1; i>=0;i--) {
		 	if (str[i] == ' ') {
			    str[newLength -1] ='0';
			    str[newLength -2] ='2';
			    str[newLength -3] ='%';
			    newLength = newLength-3;
		    } else {
			    str[newLength -1] = str[i];
			    newLength = newLength -1;
		    }
		}
		System.out.print("替换后结果：");
		for (int j = 0; j <str.length; j++) {
			System.out.print(str[j]);
		}
	}
}
