import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) {
                arr[i] = arr[i] * k;
                answer.add(arr[i]);
            } else if (k % 2 == 0) {
                arr[i] = arr[i] + k;
                answer.add(arr[i]);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
