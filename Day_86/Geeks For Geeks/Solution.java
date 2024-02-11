class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        if(n == 0)
        {
            return list;
        }
        list.add(0);
        map.put(0,1);
        if(n == 1)
        {
            return list;
        }
        for(int i=1;i<n;i++)
        {
            if(list.get(i-1)-i>0 && !map.containsKey((list.get(i-1)-i)))
            {
                map.put(list.get(i-1)-i,1);
                list.add(list.get(i-1)-i);
            }
            else
            {
                map.put(list.get(i-1)+i,1);
                list.add(list.get(i-1)+i);
            }
        }
        return list;
    }
}
