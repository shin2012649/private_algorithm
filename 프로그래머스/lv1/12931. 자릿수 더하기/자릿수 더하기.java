public class Solution {
    public int solution(int n) {
        int answer = 0;

        // N을 문자열로 변환
        String strN = String.valueOf(n);

        // 각 자릿수를 순회하여 합을 계산
        for (int i = 0; i < strN.length(); i++) {

            answer += strN.charAt(i) - '0';
        }

        return answer;
    }
}
