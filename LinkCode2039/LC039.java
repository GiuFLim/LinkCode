package LinkCode2039;

import java.util.List;

public class LC039 {
	public void recoverRotatedSortedArray(List<Integer> nums) {
		int pos=1;
		int len=nums.size();
		//找到下降的分界点
		for(;(pos<len)&&(nums.get(pos)>=nums.get(pos-1));++pos);
		if(pos==len)return;
		reverse(nums, 0, pos-1);
		reverse(nums, pos, len-1);
		reverse(nums, 0, len-1);
		
	}
	public void reverse(List<Integer> nums,int begin,int end){
		while(begin<end){
			int tmp=nums.get(begin);
			nums.set(begin, nums.get(end));
			nums.set(end, tmp);
			begin++;
			end--;
		}
	}

}
