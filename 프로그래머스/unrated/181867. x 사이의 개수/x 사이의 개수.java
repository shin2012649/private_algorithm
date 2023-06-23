import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int first = 0;
        
        for (int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                int length = i - first ;
                list.add(length);
                first = i + 1;
                
            }
        }
        int length = myString.length() - first;
        list.add(length);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            
        }
            
        
        return answer;
    }
}