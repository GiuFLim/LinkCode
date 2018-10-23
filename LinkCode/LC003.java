package LinkCode;

//右循
public class LC003 {
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

}
