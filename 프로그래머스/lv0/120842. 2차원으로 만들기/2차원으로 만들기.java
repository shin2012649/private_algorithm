class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        int row = 0;
        int col = 0;
        for (int i = 0; i < num_list.length; i++) {
            answer[row][col] = num_list[i];
            col++;
            if (col == n) {
                col = 0;
                row++;
            }
        }
        
        return answer;
    }
}
