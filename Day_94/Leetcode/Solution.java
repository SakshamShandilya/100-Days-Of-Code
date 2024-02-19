public class Solution {
     
        public void sortColors(int[] nums) {
     
            int[] numeros = new int[3];
     
            for (int num : nums) numeros[num]++;
     
            int i = 0;
            for (int j = 0; j < 3; j++) {
                while (numeros[j] > 0) {
                    nums[i] = j;
                    numeros[j]--;
                    i++;
                }
            }
        }
    }
