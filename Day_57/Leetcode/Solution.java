class MedianFinder {
    
    ArrayList<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i;
        if(list.size() > 0){
            for (i = 0; (i < list.size()  && list.get(i) < num); i++);
            list.add(i , num);
        }else{
            list.add(num);
        }
    }
    
    public double findMedian() {
        int index = list.size()/2;
        if(list.size() % 2 == 0){
            return (double) (list.get(index) + list.get(index - 1))/2;
        }else{
            return list.get(index);
        }
        
    }
}
