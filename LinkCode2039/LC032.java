package LinkCode2039;
/*
 * 最小子串覆盖
给定一个字符串source和一个目标字符串target，
在字符串source中找到包括所有目标字符串字母的子串。
 */

/*
 * 利用 hash 表来记录字符串中字母出现次数
当 target 中每个字母在 sourcehash 表中出现次数大于在 targethash 表中
出现次数则认为满足包含条件
 */
public class LC032 {
	int initTargetHash(int[] targethash, String Target) {
		int targetNum = 0;
		for (char ch : Target.toCharArray()) {
			targetNum++;
			targethash[ch]++;
		}
		return targetNum;
	}

	boolean valid(int[] sourcehash, int[] targethash) {
		for (int i = 0; i < 256; i++) {
			if (targethash[i] > sourcehash[i])
				return false;
		}
		return true;
	}

	public String minWindow(String source, String target) {
		int ans = Integer.MAX_VALUE;
		String minstr = "";

		int[] sourcehash = new int[256];
		int[] targethash = new int[256];

		initTargetHash(targethash, target);
		int i = 0, j = 0;
		for (; i < source.length(); i++) {
			while (!valid(sourcehash, targethash) && j < source.length()) {
				sourcehash[source.charAt(j)]++;
				j++;
			}
			if(valid(sourcehash, targethash)){
				if(ans>j-i){
					ans=Math.min(ans, j-i);
					minstr=source.substring(i,j);
				}
			}
			sourcehash[source.charAt(i)]--;
		}
return minstr;
	}
}
