class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()) {
            return list;
        }

        int[] freqS = new int[26];
        int[] freqP = new int[26];


        for(int i=0; i<p.length(); i++) {
            freqS[s.charAt(i)-'a']++;
            freqP[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(freqS, freqP)) {
            list.add(0);
        }

        int start = 0;
        int end = p.length();

        while(end < s.length()) {

            freqS[s.charAt(start)-'a']--;
            freqS[s.charAt(end)-'a']++;

            if(Arrays.equals(freqS, freqP)) {
                list.add(start+1);
            }
            end++;
            start++;
        }
        return list;
    }
}
