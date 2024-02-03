class Solution
{  
   long DecimalValue(Node head)
   {
   		long MOD = 1000000007;
 		long result = 0;
        	while(head != null)
        	{
        		result = ((result * 2) % MOD + head.data % MOD) % MOD;
        		head = head.next;
        	}
       return result;
   }
}
