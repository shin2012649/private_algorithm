class Solution {
    public int solution(String s) {
        String[] numbers = s.split(" ");
        int answer = 0;
        int before = 0;
        
        for (String number : numbers) {
            if (number.equals("Z")) {
                answer -= before;
            } else {
                int num = Integer.parseInt(number);
                answer += num;
                before = num;
            }
        }
        
        return answer;
    }
}
