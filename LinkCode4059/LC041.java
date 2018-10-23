package LinkCode4059;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class LC041 {
	public int maxSubArray(int[] nums) {
		// write your code here
		int sum = nums[0];// 当前遍历到的最大和的子集
		int max = nums[0];// 数组的最大和
		for (int i = 1; i < nums.length; i++) {
			sum = sum > 0 ? (sum + nums[i]) : nums[i];
			max = max > sum ? max : sum;
		}
		return max;
	}

	/*
	 * 创建两个长度也为nums.size()的数组。 含义为从左自右、从右自左分别遍历数组。
	 * 每个数组left[i]记录在从0到当前位置(i)下的最大子数组的和。 例如 left[i]的值表示nums从0至i中最大子数组的值，
	 * right[i]的值表示nums从i至size-1中最大子数组的值。 最后求两个子数组和最大，就是找left[]从0~i,
	 * 和right[]从i+1到length的最大字数最后只需遍历一遍left,right数组即可 注：寻找最大字数组的和可以参考 lintcode
	 * 41. 最大子数组。算法很巧妙，时间复杂度为O(n)
	 * 
	 */
	public int maxTwoSubArrays(List<Integer> nums) {
		// write your code here
		/*
		 * int arr[]=new int[nums.size()]; for(int i=0;i<nums.size();i++)
		 * arr[i]=nums.get(i);//把List转换成一个二维数组 int []left=new int[arr.length];
		 * int []right=new int[arr.length];
		 * 
		 * int Lsum=arr[0];//当前遍历到的最大和的子集 int Lmax=arr[0];//数组的最大和 for(int
		 * i=1;i<arr.length;i++){ Lsum=Lsum>0?(Lsum+arr[i]):arr[i];
		 * Lmax=Lmax>Lsum?Lmax:Lsum; left[i]=Lmax; }
		 * 
		 * int Rsum=arr[arr.length-1];//当前遍历到的最大和的子集 int
		 * Rmax=arr[arr.length-1];//数组的最大和 for(int i=arr.length-1;i>=0;i--){
		 * Rsum=Rsum>0?(Rsum+arr[i]):arr[i]; Rmax=Rmax>Rsum?Rmax:Rsum;
		 * right[i]=Rmax; } int max=left[0]+right[1]; for( int
		 * i=1;i<arr.length-1;i++){ if(max<(left[i]+right[i+1]))
		 * max=left[i]+right[i+1]; } return max; }
		 */
		int arr[] = new int[nums.size()];
		for (int i = 0; i < nums.size(); i++) {
			arr[i] = (int) nums.get(i); // 把ArrayList转换成一个二维数组
		}
		// 创建left数组。含义为从左向右遍历arr[]，在从0到当前位置(i)下的最大子数组的和
		int left[] = new int[arr.length];
		// 从右向左找
		int right[] = new int[arr.length];
		int leftmax = arr[0]; // 在left数组，此位置下最大子数组的和，并初始化
		int maxl = 0; // left中 当前子数组长度变量
		left[0] = leftmax; // 设置left[0]

		for (int i = 0; i < left.length; i++) {
			
			maxl += arr[i]; // 当前子数组的和
			if (maxl > leftmax) // 如果大于leftmax(最大字数组的和)
				leftmax = maxl; // 赋值
			if (maxl < 0) // 如果小于0了，重新开始计数
				maxl = 0;
			left[i] = leftmax; // left[i]存储当前最大数组的和
		}

		// right数组存取的为，从右向左遍历，当前位置到最后，最大子数组的和
		int rightmax = arr[arr.length - 1];
		int maxr = 0;
		right[arr.length - 1] = rightmax;
		for (int i = right.length - 1; i >= 0; i--) {
			maxr += arr[i];
			if (rightmax < maxr)
				rightmax = maxr;
			if (maxr < 0)
				maxr = 0;
			right[i] = rightmax;
		}
		// 求两个子数组最大，就是找left[]从0~i, 和right[]从i+1到length的最大字数组的和
		int MAX = left[0] + right[1]; // 初始化
		// 只需遍历一遍即可
		for (int i = 1; i < arr.length - 1; i++) {
			if (MAX < (left[i] + right[i + 1]))
				MAX = left[i] + right[i + 1];
		}
		return MAX;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC041 sLc041 = new LC041();
		int[] nums = new int[] { -2, 2, -3, 4, -1, 2, 1, -5, 3 };

		System.out.println(sLc041.maxSubArray(nums));

		List<Integer> nums1 = new ArrayList<Integer>();
		// 1, 3, -1, 2, -1, 2
		nums1.add(1);
		nums1.add(3);
		nums1.add(-1);
		nums1.add(2);
		nums1.add(-1);
		nums1.add(2);
		System.out.println(sLc041.maxTwoSubArrays(nums1));
	}

}
