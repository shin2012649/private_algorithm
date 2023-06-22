import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> words = new ArrayList<>();
        StringBuilder w = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (c != ' ') {
                w.append(c);
            } else if (w.length() > 0) {
                words.add(w.toString());
                w.setLength(0);
            }
        }

        if (w.length() > 0) {
            words.add(w.toString());
        }

        String[] answer = new String[words.size()];
        for (int i = 0; i < words.size(); i++) {
            answer[i] = words.get(i);
        }

        return answer;
    }
}

// class Solution {
//     public String[] solution(String my_string) {
//         String[] answer = my_string.trim().split("\\s+");
//         return answer;
//     }
// }

