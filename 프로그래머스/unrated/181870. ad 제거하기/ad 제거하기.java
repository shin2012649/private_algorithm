class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;

        for (String str : strArr) {
            if (!str.contains("ad")) {
                count++;
            }
        }

        String[] answer = new String[count];
        int result = 0;

        for (String str : strArr) {
            if (!str.contains("ad")) {
                answer[result] = str;
                result++;
            }
        }

        return answer;
    }
}
