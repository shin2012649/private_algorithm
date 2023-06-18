class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;

        if(num_list.length % n == 0) answer = new int[num_list.length / n];
        else answer = new int[num_list.length / n + 1];

        int idx = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[idx];
            idx += n;
        }

        return answer;
    }
}