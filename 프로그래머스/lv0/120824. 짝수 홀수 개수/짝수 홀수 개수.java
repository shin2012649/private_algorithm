class Solution {
    public int[] solution(int[] num_list) {
        int E = 0;
        int O = 0;
        
        for( int num: num_list){
            if(num % 2 == 0){
                E++;
            }else{
                O++;
            }
        }
        
        int [] answer = {E, O};
        return answer;
}
}

