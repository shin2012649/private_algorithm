class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
       String[] R = num_str.split("");
        
        for (int i = 0; i < R.length; i++){
            answer += Integer.parseInt(R[i]);
        }
        
        return answer;
    }
}
