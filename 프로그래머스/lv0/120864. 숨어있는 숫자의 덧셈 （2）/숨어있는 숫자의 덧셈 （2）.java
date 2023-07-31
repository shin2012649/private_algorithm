class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] s  = my_string.split("[^0-9]+");
        
        for(int i = 0; i < s.length; i++){
            
            if(!s[i].isEmpty()){
            answer += Integer.parseInt(s[i]);
            }
        }
        return answer;
    }
}