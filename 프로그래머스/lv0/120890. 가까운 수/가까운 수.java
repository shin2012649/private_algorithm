import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int num = n+100;
        for (int i = 0; i < array.length; i++) {
          if (Math.abs(array[i] - n) < num) {
            num = Math.abs(array[i] - n);
            answer = i;
          }
        }
        return array[answer];
    }
}