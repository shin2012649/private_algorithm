class Solution {
    private static final String[] DRINK = {"americano","cafelatte"};
    public int solution(String[] order) {
        int answer = 0;
        for(String str : order){
            if(str.equals("anything")){
                answer += 4_500;
                continue;
            }
            if(str.indexOf(DRINK[0]) == -1){
                answer += 5_000;
            }else{
                answer += 4_500;
            }
        }
        return answer;
    }
}