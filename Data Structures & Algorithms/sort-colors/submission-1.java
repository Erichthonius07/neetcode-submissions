class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int current = 0;
        int temp = 0;
        while (current <= high)
        {
            if(nums[current] == 0)
            {
                temp = nums[low];
                nums[low]= nums[current];
                nums[current] = temp;
                low++;
                current++;
            }
            else if(nums[current] == 2)
            {
                temp = nums[high];
                nums[high]= nums[current];
                nums[current] = temp;
                high--;
            }
            else
                current++;
        }
    }
}