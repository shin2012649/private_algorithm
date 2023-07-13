import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i)-48 >= 0 && my_string.charAt(i)-48 <=9){
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i]= list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
