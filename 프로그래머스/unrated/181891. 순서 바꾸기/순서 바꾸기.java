import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer =  new int[num_list.length];
        
        
        int[] A = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] B = Arrays.copyOfRange(num_list, 0, n);
        
        System.arraycopy(A, 0, answer, 0, A.length);
        System.arraycopy(B, 0, answer, A.length, B.length);
        
        return answer;
    }
}