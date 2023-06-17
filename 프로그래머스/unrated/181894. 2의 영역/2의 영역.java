import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        if (first == -1) {
            return new int[]{-1};
        }

        for (int i = first; i <= last; i++) {
            subArray.add(arr[i]);
        }

        int[] answer = new int[subArray.size()];
        for (int i = 0; i < subArray.size(); i++) {
            answer[i] = subArray.get(i);
        }

        return answer;
    }
}
