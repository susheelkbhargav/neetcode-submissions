class Solution {
    public int findMin(int[] nums) {
        // [1,2,3,4,5]
        // after rotation - [4,5,1,2,3]
        // [2,3,4,5,1]
        int l = 0;
        int n = nums.length;
        int r = n-1;
        int candidate = nums[0];
        //binary search 
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(nums[mid] <= nums[r]){
                 candidate = Math.min(candidate, nums[mid]);
                 r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return candidate;
       
    }
}
