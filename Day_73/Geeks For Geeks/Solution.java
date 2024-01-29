class Solution
{
    static int MAX = 400;
    static int dp[][] = new int[MAX][9 * MAX + 1];
    static int countGroups(int position,
                int previous_sum,
                int length, String num)
    {
        if (position == length)
            return 1;
        if (dp[position][previous_sum] != -1)
            return dp[position][previous_sum];
        dp[position][previous_sum] = 0;
 
        int res = 0;
        int sum = 0;
        for (int i = position; i < length; i++)
        {
            sum += (num.charAt(i) - '0');
            if (sum >= previous_sum)

            res += countGroups(i + 1, sum,
                            length, num);
        }
 
        dp[position][previous_sum] = res;
        return res;
    }
    public int TotalCount(String str)
    {
        int n = str.length();
        for(int i = 0; i < dp.length; i++)
        {
            for(int j = 0;j < 9 * MAX + 1; j++){
                dp[i][j] = -1;
            }
        }
        return countGroups(0, 0, n, str);
    }
}
