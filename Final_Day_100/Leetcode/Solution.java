class Solution {
    public int maximalRectangle(char[][] m) {
        int h[][]=new int[m.length+1][m[0].length+1];
        int b[][]=new int[m.length+1][m[0].length+1];
        int res[][]=new int[m.length][m[0].length];
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]=='0') continue;
                else{
                    h[i+1][j+1]=h[i][j+1]+1;
                    b[i+1][j+1]=b[i+1][j]+1;
                    maxi=Math.max(maxi,Math.max(h[i+1][j+1],b[i+1][j+1]));
                }
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]=='0') continue;
                if(b[i][j+1]!=0 && b[i+1][j+1]!=0 && h[i+1][j+1]!=0){
                    int val=find(h,b,i,j,Math.min(b[i][j+1],b[i+1][j+1]));
                    res[i][j]=val;
                    maxi=Math.max(maxi,val);
                }
                else res[i][j]=1;
            }
        }
        return maxi==Integer.MIN_VALUE?0:maxi;
    }
    public int find(int[][] h,int[][] b,int i,int j,int len){
        int mini=Integer.MIN_VALUE;
        int v=0,cur=0;
        for(int k=1;k<=len;k++){
            if(k==1){
                v=h[i+1][j+1];
                cur=h[i+1][j+1];
            }
            else{
                cur=Math.min(cur,h[i+1][j+1]);
                v=k*cur;
            }
            mini=Math.max(mini,v);
            j--;
        }
        return mini;
    }
}
