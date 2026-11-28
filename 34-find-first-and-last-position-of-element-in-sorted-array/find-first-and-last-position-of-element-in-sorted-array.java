class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = -1;
        int end =-1;
        int l =0;
        int h = n-1;
        while(l<= h)
        {
            int mid = l +(h-l)/2;
            if(nums[mid] == target)
            {
                start = mid;
                h = mid -1;
            }
            else if(nums[mid] < target)
            {
                l = mid+1;
            }
            else
            {
                h = mid -1;
            }
        }
        l = 0;
        h = n-1;
         while(l<= h)
        {
            int mid = l +(h-l)/2;
            if(nums[mid] == target)
            {
                end = mid;
                l = mid + 1;
            }
            else if(nums[mid] < target)
            {
                l = mid+1;
            }
            else
            {
                h = mid -1;
            }
        }
        return new int[]{start,end};
    }
}