class Solution{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary ){
        int i,j,k;
        TreeSet<String> mp = new TreeSet<String>(); 
        for(i=0;i<n;i++)
            mp.add(dictionary.get(i));
        int len = s.length();
        ArrayList<Boolean> dp = new ArrayList<Boolean>(len + 1);
        for(i=0;i<len;i++)
            dp.add(i,false);
        dp.add(0,true);
        for(i = 1; i <= len; i++) {
            for(j = 0; j <len; j++) {
                if(dp.get(j)  && mp.contains(s.substring(j, i))) {
                    dp.add(i,true);
                    break;
                }
            }
        }
        if(dp.get(len))
            return 1;
        return 0;    
            
    }
}
