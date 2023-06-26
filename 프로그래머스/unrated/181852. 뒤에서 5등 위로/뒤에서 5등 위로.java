import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
    
        int[] answer = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(answer);

       
        int[] result = Arrays.copyOfRange(answer, 5, answer.length);

        return result;
    }
}
