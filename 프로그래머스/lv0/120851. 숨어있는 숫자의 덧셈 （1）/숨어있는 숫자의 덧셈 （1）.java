class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        
        char[] C = my_string.toCharArray();
        String S = "";
        
        for(int i=0; i<C.length; i++){
            if(49<=C[i] && C[i]<=57){
                S += C[i];
            }
        }
        
      String[] S_arr = S.split("");
        for(int i = 0; i < S_arr.length; i++){
            answer += Integer.parseInt(S_arr[i]);
        }
        
        return answer;
    }
}

       
        
        