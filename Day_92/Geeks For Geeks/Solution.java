class Solution {
    
    public boolean countSub(long arr[], long n)
    {
         for(int i = 0; i <= n / 2; i++)
        {
            if((2 * i + 1 < n && arr[i] < arr[2 * i + 1]) || (2 * i + 2 < n && arr[i] < arr[2 * i + 2]))
            {
                return false;
            }
        }
        return true;
    }
}
