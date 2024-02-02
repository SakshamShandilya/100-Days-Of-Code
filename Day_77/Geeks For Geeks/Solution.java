class Solution
{
    boolean isNumericChar(char x) {
        return (x>= '0' && x<='9')?true:false;
    }
    int atoi(String s)
    {
        int n = s.length();
        if(s == "")
            return 0;
        int res = 0;
        int sign = 1;
        int i = 0;
        char c[] = s.toCharArray();
        if(c[0]=='-')
        {
            sign = -1;
            i++;
        }
        for(;i<n;i++)
        {
            if(isNumericChar(c[i]) == false)
                return -1;
            res = res*10 + c[i] - '0';
        }
        return sign*res;
    }
}
