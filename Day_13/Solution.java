class Solution {
    public boolean searchMatrix(int[][] arr, int key) {
        int n = arr.length;
        int m = arr[0].length;
        boolean res = false;
        
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(key>=arr[mid][0] && key<=arr[mid][m-1]){
                if(Arrays.binarySearch(arr[mid],key)>=0){
                    res=true;
                }
                break;
            }else if(key<=arr[mid][0]){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return res;
    }

}
