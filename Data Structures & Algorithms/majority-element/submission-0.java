class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
       HashMap<Integer,Integer> freq = new HashMap<>();
       for(int i : nums)
       {
            freq.put(i,freq.getOrDefault(i,0)+1);           
       }
       for(Map.Entry<Integer,Integer> entry : freq.entrySet())
       {
        if( entry.getValue() > len/2 )
        {
            return entry.getKey();
        }
       }
       return -1;
    }
}