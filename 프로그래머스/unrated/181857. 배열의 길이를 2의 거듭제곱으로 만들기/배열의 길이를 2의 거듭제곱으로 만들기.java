import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int A = arr.length;
        int B = 1;
        
        while(B < A){
            B *= 2;
        }
        
        int[] answer = Arrays.copyOf(arr, B);
        
        return answer;
        
    }
}
        
      
     