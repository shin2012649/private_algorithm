public class Solution {
    public int solution(int[] array) {
        int[] counts = new int[10001];

        
        for (int num : array) {
            counts[num]++;
        }

        int max = 0;
        int answer = -1;

  
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                answer = i;
            } else if (counts[i] == max) {
                answer = -1; 
            }
        }

        return answer;
    }
}
