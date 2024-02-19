class Solution{
    static int minValue(String s,int k){
        int freq[] = new int[26];
        for(int i = 0;i < s.length();i++)
			freq[s.charAt(i)-'a']++;
		PriorityQueue<Integer> p=new PriorityQueue(s.length(), new Comparator<Integer>(){
			public int compare(Integer i1,Integer i2){
				return i2-i1;
			}
		});
		for(int i = 0;i < 26;i++)
		    p.add(freq[i]);
	    while(k-- > 0){
		    int temp = p.peek();
		    p.poll();
		    temp = temp - 1;
		    p.add(temp);
		}
		int result = 0;
		while(!p.isEmpty()){
		    int x = p.peek();
		    result += (x*x);
		    p.poll();
		}
		return result;
    }
}
