import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
        
        for(int i =0; i < numlist.length; i++){
            if(numlist[i]%n ==0){
                arr.add(numlist[i]);
                a++; 
            }
        } 
        int[] answer = new int[a];
        for(int i=0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}