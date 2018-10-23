package giuf;

import java.util.Arrays;

public class Jcode001 {
	public int max(int min, int[] arr) {
		int max = min;
		for (int a : arr) {
			if (a > max)
				max = a;
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jcode001 s = new Jcode001();
		int[] arr = { 34, 56, 32, 4, 67 };
		int r = s.max(0, arr);
		
		System.out.println(r);	
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		float value1=9.625f;
		System.out.println(Integer.toBinaryString(Float.floatToIntBits(value1)));
		double value2=9.625;
		System.out.println(Long.toBinaryString(Double.doubleToLongBits(value2)));
		char c='马';
		System.out.println(Integer.toBinaryString(c));
	}

}
