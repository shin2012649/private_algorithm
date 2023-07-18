class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);

        for (int i = 0; i < orderStr.length(); i++) {
            char digit = orderStr.charAt(i);
            if (digit == '3' || digit == '6' || digit == '9') {
                answer++;
            }
        }

        return answer;
    }
}
