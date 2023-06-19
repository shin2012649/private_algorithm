import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> X = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                X.add(todo_list[i]);
            }
        }

        String[] answer = X.toArray(new String[X.size()]);
        return answer;
    }
}

