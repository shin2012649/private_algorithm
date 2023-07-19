class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int I = i; I <= j;  I++){
            
            String str = Integer.toString(I);
            
            for(int J = 0; J < str.length(); J++){
                if(Integer.toString(k).equals(str.substring(J, J+1)))
                    answer++;
            }
            
        }
        
        
        
        return answer;
    }
}