public class Solution {
    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];

        int idx = 0;
        for (int i = 0; i < arr.length && idx < k; i++) {
            boolean duplicate = false;
            for (int j = 0; j < idx; j++) {
                if (answer[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                answer[idx++] = arr[i];
            }
        }

        while (idx < k) {
            answer[idx++] = -1;
        }

        return answer;
    }
}