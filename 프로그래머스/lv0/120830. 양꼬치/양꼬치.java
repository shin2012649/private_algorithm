class Solution {
    public int solution(int n, int k) {
        int X = 12000;
        int Soju = 2000;
        
        int totalX = n * X;
        int totalSoju = (k-(n/10)) * Soju;
        
        int totalPrice = totalX + totalSoju;
        
        return totalPrice;
    }
}
