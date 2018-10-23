package LinkCode;

public class LC004 {
	public char[] rightRotateString(char[] str, int offset) {
		// write your code here

		int len = str.length;
		if (str == null || len == 0)
			return null;
		offset = offset % len;
		reverse(str, 0, len - offset - 1);
		reverse(str, len - offset, len - 1);
		reverse(str, 0, len - 1);
		return str;

	}

	// 左循
	public char[] leftRotateString(char[] str, int offset) {
		int len = str.length;
		if (str == null || len == 0)
			return null;
		offset = offset % len;
		reverse(str, 0, offset - 1);
		reverse(str, offset, len - 1);
		reverse(str, 0, len - 1);
		return str;
	}

	public void reverse(char[] str, int from, int to) {
		while (from <= to) {
			char t = str[from];
			str[from] = str[to];
			str[to] = t;
			from++;
			to--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC004 s = new LC004();
		String str = "abcdefg";
		// char []arr={'a','b','c','d','e','f','g'};
		char[] arr = str.toCharArray();// 将字符串变量转换为字符数组
		// str=String.valueOf(arr);将字符数组转换为字符串
		// System.out.println(s.rightRotateString(arr,3));
		System.out.println(s.leftRotateString(arr, 3));
		
	}

}
