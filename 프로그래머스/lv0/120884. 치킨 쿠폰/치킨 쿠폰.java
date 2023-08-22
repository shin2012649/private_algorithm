class Solution {
    public int solution(int chicken) {
        int newC = chicken;
        int remainC = 0;
        int answer = 0;
        
        while(newC+remainC >= 10){
            int C1 = (newC + remainC) / 10;
            int C2 = (newC + remainC) % 10;
            
            newC = C1;
            remainC = C2;
            answer += newC;
        }
        
        return answer;
    }
}