class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int sum = nums1.length + nums2.length;
		 int[] nums = new int[sum];	
		
		 int i=0,j=0,k = 0;
		 while(i<nums1.length || j<nums2.length){
			 if (i<nums1.length && j<nums2.length){
				 if (nums1[i] <= nums2[j]){
						nums[k++] = nums1[i];
						i++;
				 }else{
					nums[k++] = nums2[j];
					j++;
				 } 
			 }else if (i >= nums1.length){
				 nums[k++] = nums2[j];
				 j++;
			 }else if (j >= nums2.length){
				 nums[k++] = nums1[i];
				 i++;
			 }
			
		 }
		 if (sum%2 == 0){//偶数
			 return (nums[sum/2 -1] + nums[sum/2])/2.0;
		 }else{
			 return nums[sum/2];
		 }
	        
    }
}
