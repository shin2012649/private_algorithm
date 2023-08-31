class Solution {
    public int solution(int[][] sizes) {
        int long_max = 1;
        int short_max = 1;
        
        for(int i = 0; i < sizes.length; i++){
            int longer = Math.max(sizes[i][0], sizes[i][1]);
            int shorter = Math.min(sizes[i][0], sizes[i][1]);
            
            if(longer > long_max) {
                long_max = longer;
            }
            if(shorter > short_max) {
                short_max = shorter;
            }
        }
        
        return long_max * short_max;
    }
}