class Solution {
    public int solution(int n) {
        int answer = 1; 

        for(int i = 1; i <= n-1; i++) {
            int sum = i;
            for(int j = i + 1; sum < n; j++) {
                sum += j;
            }
            if(sum == n) answer++;
        }

        return answer;
    }
}