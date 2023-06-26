import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                    i++;
                } else {
                    stk.add(arr[i]);
                    i++;
                }
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[stk.size()];
            for (int j = 0; j < stk.size(); j++) {
                answer[j] = stk.get(j);
            }
            return answer;
        }
    }
}

 