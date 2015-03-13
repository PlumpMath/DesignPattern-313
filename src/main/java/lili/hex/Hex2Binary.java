package lili.hex;

/**
 * Created by lili on 2015/3/13.
 * 在Java中字节与十六进制的相互转换主要思想有两点：

 1、二进制字节转十六进制时，将字节高位与0xF0做"&"操作,然后再左移4位，得到字节高位的十六进制A;
  将字节低位与0x0F做"&"操作，得到低位的十六进制B，将两个十六进制数拼装到一块AB就是该字节的十六进制表示。
 2、十六进制转二进制字节时，将十六进制字符对应的十进制数字右移动4为，得到字节高位A;
  将字节低位的十六进制字符对应的十进制数字B与A做"|"运算，即可得到十六进制的二进制字节表示
 */
public class Hex2Binary {
	//16进制串
	private static String hexStr =  "0123456789ABCDEF";

	public static void main(String[] args)
	{
		String str = "二进制与十六进制互转测试";

		String hexString = BinaryToHexString(str.getBytes());
		System.out.println("str转换为十六进制：\n"+hexString);

		System.out.println("将str的十六进制文件转换为二进制并转为String：\n"+new String(HexStringToBinary(hexString)));

	}

	/**
	 *
	 * @param bytes
	 * @return 将二进制转换为十六进制字符输出
	 */
	public static String BinaryToHexString(byte[] bytes){

		String result = "";
		String hex = "";
		for(int i=0;i<bytes.length;i++){
			//字节高4位
			hex = String.valueOf(hexStr.charAt((bytes[i]&0xF0)>>4));
			//字节低4位
			hex += String.valueOf(hexStr.charAt(bytes[i]&0x0F));
			result +=hex;
		}
		return result;
	}
	/**
	 *
	 * @param hexString
	 * @return 将十六进制转换为字节数组
	 */
	public static byte[] HexStringToBinary(String hexString){
		//hexString的长度对2取整，作为bytes的长度
		int len = hexString.length()/2;
		byte[] bytes = new byte[len];
		byte high = 0;//字节高四位
		byte low = 0;//字节低四位

		for(int i=0;i<len;i++){
			//右移四位得到高位
			high = (byte)((hexStr.indexOf(hexString.charAt(2*i)))<<4);
			low = (byte)hexStr.indexOf(hexString.charAt(2*i+1));
			bytes[i] = (byte) (high|low);//高地位做或运算
		}
		return bytes;
	}
}
