class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> check = new HashMap<>();
        int len = nums.length;
        int[] ans = new int[2];
        
        for(int i = 0; i < len; i++)
        {
            if(check.containsKey(target-nums[i]))
            {
                ans[0] = check.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            else
                check.put(nums[i],i);
        }
        return ans;

    }
}
