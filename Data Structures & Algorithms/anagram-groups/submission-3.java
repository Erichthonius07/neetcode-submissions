class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> answer = new HashMap<>();

        for(String s : strs)
        {
            char[] freq = new char[26];
            for(char c : s.toCharArray())
                freq[c-'a']++;
            String key = String.valueOf(freq);
            
            if (!answer.containsKey(key))
                answer.put(key, new ArrayList<>());
            
            answer.get(key).add(s);
        }

        return new ArrayList<>(answer.values());
    }
}