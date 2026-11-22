class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sum =0;
        long curr = 0;
        int i=0,j=0;
        HashSet<Integer> set =  new HashSet<>();
        while(j<n)
        {
            while(set.size()==k || set.contains(nums[j]))
            {
                set.remove(nums[i]);
                curr -= nums[i++];
            }
            set.add(nums[j]);
            curr+=nums[j++];
            if(set.size() == k)
            {
                sum = Math.max(sum,curr);
            }
        }
        return sum;

    }
}