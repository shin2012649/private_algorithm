class Solution {
    boolean solution(String s) {
        int P = 0; //p의 개수 
        int Y = 0; //y의 개수
        boolean answer = true;
        
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++){
            char C = s.charAt(i);
            
            if(C == 'p'){
                P++;
            }else if(C == 'y'){
                Y++;
            }
            answer= P==Y ? true : false;
        }
            return answer;
    }
}
