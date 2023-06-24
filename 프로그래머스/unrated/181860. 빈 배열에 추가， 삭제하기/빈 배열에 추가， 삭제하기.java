import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int count = arr[i] * 2;
                for (int j = 0; j < count; j++) {
                    result.add(arr[i]);
                }
            } else {
                int count = Math.min(arr[i], result.size());
                for (int j = 0; j < count; j++) {
                    result.remove(result.size() - 1);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
