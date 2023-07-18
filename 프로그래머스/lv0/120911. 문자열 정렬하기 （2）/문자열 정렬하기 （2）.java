import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String answer = my_string.toLowerCase();
        
        char[] charArray  = answer.toCharArray();
        
        
        Arrays.sort(charArray);
        
        
        
        return new String(charArray);
    }
}