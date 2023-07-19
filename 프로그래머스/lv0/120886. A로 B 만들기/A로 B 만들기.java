import java.util.*;

class Solution {
    public int solution(String before, String after) {
  
        char[] before_c = before.toCharArray();
        char[] after_c = after.toCharArray();
        
        Arrays.sort(before_c);
        Arrays.sort(after_c);
        
        String Before = new String (before_c);
        String After = new String (after_c);
        
        if(Before.equals(After)){
            return 1;
            
        }else{
            return 0;
        }
    }
}