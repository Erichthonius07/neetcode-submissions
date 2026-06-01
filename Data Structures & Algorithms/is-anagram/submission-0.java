class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(char element : s.toCharArray()) {
            freq[element - 'a']++;
        }
        for(char element : t.toCharArray()) {
            freq[element - 'a']--;
        }

        for(int i : freq)
        {
            if( i!= 0)
                return false;
        }

        return true;
    }
}
