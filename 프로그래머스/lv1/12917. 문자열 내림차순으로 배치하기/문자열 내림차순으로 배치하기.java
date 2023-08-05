import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        // 내림차순으로 정렬된 배열을 문자열로 변환
        String answer = new StringBuilder(new String(c)).reverse().toString();
        return answer;
    }
}
