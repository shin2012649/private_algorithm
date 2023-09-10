import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int people =0;
        int turn =0;
        List<String> list =new ArrayList<>();
        list.add(words[0]);
        
        for(int i=1;i<words.length;i++){   
        if(!list.contains(words[i])&&words[i-1].charAt(words[i-1].length()-1)==words[i].charAt(0)){
             list.add(words[i]);
         }   
         else{
             people=(i%n)+1;
             turn=(i/n)+1;
             break;
         }
        }
        answer[0]=people;
        answer[1]=turn;
        return answer;
    }
}
