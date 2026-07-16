class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for(int i : nums)
        {
            freq[i] += 1;
        }
        int len = 0;
        int numlen = nums.length;
        for(int j = 0; j <freq.length; j ++)
        {
            while( len <= numlen && freq[j]>0 )
            {
                nums[len] = j;
                freq[j]--;
                len++;
            }

        }

        for(int k: nums)
        {
            System.out.print(k + " ");
        }
    }
}