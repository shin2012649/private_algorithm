class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int answer = 0;

        if (x > 0 && y > 0) {       // 1사분면
            answer = 1;
        } else if (x < 0 && y > 0) {    // 2사분면
            answer = 2;
        } else if (x < 0 && y < 0) {    // 3사분면
            answer = 3;
        } else if (x > 0 && y < 0) {    // 4사분면
            answer = 4;
        }

        return answer;
    }
}
