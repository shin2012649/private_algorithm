class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i< array.length; i++){
            String Arr = Integer.toString(array[i]);
            String[] Aarr = Arr.split("");
            
            for(int j = 0; j < Aarr.length; j++){
                if(Aarr[j].equals("7")){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}