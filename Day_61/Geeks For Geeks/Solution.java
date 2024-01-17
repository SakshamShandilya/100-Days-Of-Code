class Solution {
    public static void generate(ArrayList<Integer> num, int start, ArrayList<ArrayList<Integer> > result, HashSet<ArrayList<Integer>> h) {
        if (start == num.size() - 1) {
            if(h.contains(num))
                return;
            ArrayList<Integer> perm = new ArrayList<>(num);
            h.add(perm);
            result.add(perm);
            return;
        } 
        Integer a, b;
        for (int i = start; i < num.size(); i++) {
            a = num.get(start);
            b = num.get(i);
            num.set(start, b);
            num.set(i, a);
            generate(num, start + 1, result, h);
            num.set(start, a);
            num.set(i, b);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr ,int n) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        if (arr.size() == 0)
            return result;
        generate(arr, 0, result, new HashSet<>());
        Collections.sort(result, (ArrayList<Integer> a, ArrayList<Integer> b) -> {
            int i = 0, l = Math.min(a.size(), b.size());
            while(i < l) {
                if(a.get(i).compareTo(b.get(i)) != 0)
                    return a.get(i).compareTo(b.get(i));
                i++;
            }
            return a.size() - b.size();
        });
        
        return result;
    }
}
