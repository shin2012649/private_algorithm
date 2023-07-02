class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = (numer1 * denom2) + (numer2 * denom1); 
        int denom = denom1 * denom2;
        
        for(int i = num-1; i > 1; i--) {
        
            if(num % i == 0 && denom % i == 0) { 
                num /= i;
                denom /= i;
            }
        }
        
        int[] answer = { num, denom };
        return answer;
    }
}