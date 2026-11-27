class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pre = 0,count =0;
        for(int x:nums)
        {
            pre += x;
            int req = pre - k;
            if(map.containsKey(req))
            {
                count += map.get(req);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}