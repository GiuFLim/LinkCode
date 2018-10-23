package LinkCode2039;

import java.util.Arrays;

/*
 * 给出一个整数数组 nums 和一个整数 k。划分数组（即移动数组 nums 中的元素），使得：

所有小于k的元素移到左边
所有大于等于k的元素移到右边
返回数组划分的位置，即数组中第一个位置 i，满足 nums[i] 大于等于 k。
 */

//原理就是快排的partition
public class LC030 {
	 public int partitionArray(int[] nums, int k) {
	        // write your code here
		int p=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<k){
				swap(nums[i],nums[p]);
				p++;
			}
		}
		
		 return 1;
	 }
	 public void swap(int a, int b){
		 int temp=a;
		 a=b;
		 b=temp;
	 }
}