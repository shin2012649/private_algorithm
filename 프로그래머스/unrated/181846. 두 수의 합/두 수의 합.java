class Solution {
    public String solution(String a, String b) {
        try {
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);

            String answer = String.valueOf(A + B);
            return answer;
        } catch (NumberFormatException e) {
            // 정수로 변환할 수 없는 경우 처리할 내용
            return "Error: Invalid input";
        }
    }
}


