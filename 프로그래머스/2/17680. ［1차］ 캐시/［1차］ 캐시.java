import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> que = new LinkedList<>();
        if(cacheSize==0){
            return cities.length*5;
        }        
        for(String data:cities){
            data=data.toLowerCase();
            //hit 되면 최신값으로 바꾸기
            if(que.contains(data)){
                answer++;
                que.remove(data);                
            }
            else{
                answer+=5;
                if(que.size()==cacheSize){
                    que.remove();               
                }
            }
            que.add(data);
        }      
        return answer;
    }
}
