class Solution {
    public String longestCommonPrefix(String[] strs) {
        String check = null;
        int len = strs.length;
        if(len == 0)
            return "";
        else if (len == 1)
            return strs[0];
        else {
        for(int i = 0; i < len-1; i++)
        {
            String log = "";
            String prev = strs[i];
            String current = strs[i+1];
            int limit = Math.min(prev.length(),current.length());
            for(int j = 0; j < limit; j++)
            {
                if(prev.charAt(j)==current.charAt(j))
                    log += prev.charAt(j);
                else
                    break;
            }
            if (check == null)
                check = log;
            else {
                int interlimit = Math.min(check.length(),log.length());
                String inter = "";
                for(int k = 0; k < interlimit; k++)
                {
                    if(log.charAt(k)==check.charAt(k))
                        inter += log.charAt(k);
                    else
                        break;
                }
                check = inter;
            }
        }
        }
        if (check == null)
            return "";
        else 
            return check;
    }
}

