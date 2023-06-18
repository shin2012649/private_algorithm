class Solution {
    
    private static final char LEFT = 'l';
    private static final char RIGHT = 'r';
    
    public String[] solution(String[] str_list) {
        int startIndex = 0;
        int endIndex = 0;
        int size = str_list.length;
        for(int i = 0 ; i < size ; i++){
            char ch = str_list[i].charAt(0);
            if(ch == LEFT){
                startIndex = 0;
                endIndex = i;
                break;
            }
            if(ch == RIGHT){
                startIndex = i+1;
                endIndex = size;
                break;
            }
        }
        String[] answer = new String[endIndex - startIndex];
        for(int i = startIndex ; i < endIndex ; i++){
            answer[i - startIndex] = str_list[i];
        }
        return answer;
    }
}