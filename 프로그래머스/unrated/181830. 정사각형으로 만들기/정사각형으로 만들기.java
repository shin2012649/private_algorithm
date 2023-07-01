class Solution {
    public int[][] solution(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        
        int max = Math.max(r, c);
        
     
        int[][] answer = new int[max][max];
        
     
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
