class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] arr = String.valueOf(n).split("");
        
        for(String N : arr ){
            answer += Integer.parseInt(N);
        }
        
        return answer;
    }
}