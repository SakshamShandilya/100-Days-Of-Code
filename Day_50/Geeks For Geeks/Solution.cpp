class Solution {
public:
	int sumOfPowers(int a, int b){
	    vector<int>spf(b+1,-1);
	    if(b==1)
	        return 0;
	    if(a==1)
	        a++;
	    for(int i=2;i<=b;i++)
	    {
	        if(spf[i]==-1)
	        {
	            for(int j=i;j<=b;j+=i)
    	            spf[j]=i;
	        }
	    }
	    int ans=0;
	    for(int i=a;i<=b;i++)
	    {
	        int x=i;
	        while(x!=1)
	        {
	            x/=spf[x];
	            ans++;
	        }
	    }
	    return ans;
	}
};
