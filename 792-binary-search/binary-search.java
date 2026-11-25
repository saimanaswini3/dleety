class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int ans =-1;
        while(l<=h)
        {
            int mid = l +(h - l)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                break;
            }
            else if(nums[mid] < target)
            {
                 l = mid+1;
            }
            else
            {
                h = mid - 1;
            }
        }
        return ans;
    }
}