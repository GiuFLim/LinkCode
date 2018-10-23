package LinkCode;

public class LC008 {
	public int binarySearch(int[] nums, int target) {
		int low,high,mid;
		low=0;
		high=nums.length-1;
		while(low<=high){
			mid=(low+high)/2;
			if(nums[mid]<target){
				low=mid+1;
			}
			else if(nums[mid]>target){
				high=mid-1;
			}
			else 
				return mid;
		}
		return -1;
	}

}
