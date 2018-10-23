package giuf;

/*
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class niuke001 {
	public int StrToInt(String str) {
		if (str.length() == 0)
			return 0;
		int flag = 0;
		if (str.charAt(0) == '-')
			flag = 1;
		if (str.charAt(0) == '+')
			flag = 2;
		int start = flag > 0 ? 1 : 0;
		long res = 0;
		while (start < str.length()) {
			if (str.charAt(start) > '9' || str.charAt(start) < '0')
				return 0;
			res = res * 10 + (str.charAt(start) - '0');
			start++;

		}
		return flag == 1 ? -(int) res : (int) res;

	}

	public static void main(String[] args) {
		niuke001 s = new niuke001();
		System.out.println(s.StrToInt("+1234567"));
	}

}
