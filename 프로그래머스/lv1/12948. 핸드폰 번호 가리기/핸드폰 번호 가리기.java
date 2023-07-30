public class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < length - 4; i++) {
            answer.append("*");
        }
        
        answer.append(phone_number.substring(length - 4));
        
        return answer.toString();
    }
}
