 

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + n - 1) / n];
        
        for(int i = 0; i < answer.length; i++) {
            if(i+1 == answer.length) {
                answer[i] = my_str.substring(i*n, my_str.length());
            }
            else {
                answer[i] = my_str.substring(i*n, (i+1)*n);
            }
        }
        return answer;
    }
}