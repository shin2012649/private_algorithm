class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] now = {0, 0};
        int XMax = board[0] / 2;
        int YMax = board[1] / 2;

        for (String key : keyinput) {
            if (key.equals("up")) {
                if (now[1] + 1 <= YMax) {
                    now[1]++;
                }
            } else if (key.equals("down")) {
                if (now[1] - 1 >= -YMax) {
                    now[1]--;
                }
            } else if (key.equals("left")) {
                if (now[0] - 1 >= -XMax) {
                    now[0]--;
                }
            } else if (key.equals("right")) {
                if (now[0] + 1 <= XMax) {
                    now[0]++;
                }
            }
        }

        return now;
    }
}
