import java.util.*;


class Solution {
    public String[] solution(String myString) {
        List<String> substrings = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                String substring = myString.substring(start, i);
                if (!substring.isEmpty()) {
                    substrings.add(substring);
                }
                start = i + 1;
            }
        }

     
        String lastSubstring = myString.substring(start);
        if (!lastSubstring.isEmpty()) {
            substrings.add(lastSubstring);
        }


        String[] result = substrings.toArray(new String[0]);
        Arrays.sort(result);

        return result;
    }
}

