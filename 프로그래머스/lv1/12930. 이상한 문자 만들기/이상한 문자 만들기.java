class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int idx = 0; 
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){ 
                idx = 0; 
            }
            else if(idx % 2 == 0){ //idx가 짝수면
                str[i] = str[i].toUpperCase(); //대문자로 변경
                idx++; //idx 증가
            }
            else if(idx % 2 != 0){
                str[i] = str[i].toLowerCase(); 
                idx++; 
            }
            answer += str[i];
        }
        return answer;
    }
}