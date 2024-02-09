class Solution{
    public static int isSumProperty(Node node){
        int left_data = 0;
        int right_data = 0;
        if(node == null || (node.left == null && node.right == null))
          return 1;
        else{
            if(node.left != null)
             left_data = node.left.data;
            if(node.right != null)
             right_data = node.right.data;
            if((node.data == left_data + right_data)&& 
               (isSumProperty(node.left)!=0 && isSumProperty(node.right) != 0))
               return 1;
            else
            return 0;
        }
        
    }
}
