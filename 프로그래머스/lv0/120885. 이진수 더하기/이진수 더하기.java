class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bin1B = Integer.parseInt(bin1, 2);
        int bin2B = Integer.parseInt(bin2, 2);
        int sum = bin1B+bin2B;
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}