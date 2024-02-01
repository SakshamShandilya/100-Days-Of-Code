class Solution
{
    public static boolean checkPangram (String s)
    {
        Boolean[] mark = new Boolean[26];
        for (int i = 0; i < 26; i++)
            mark[i] = false;
	    for (int i = 0; i < s.length(); i++)
	    {
	       if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	            mark[s.charAt(i) - 'A'] = true;
	       else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') 
	            mark[s.charAt(i) - 'a'] = true;
	            
	    }
	    for (int i = 0; i < 26; i++)
	        if (!mark[i])
	            return false;
	    return true;
    }
}
