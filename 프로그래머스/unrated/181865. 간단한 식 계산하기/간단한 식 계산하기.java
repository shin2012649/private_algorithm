class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] tokens = binomial.split(" ");

        int a = Integer.parseInt(tokens[0]);
        String op = tokens[1];
        int b = Integer.parseInt(tokens[2]);

        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }

        return answer;
    }
}
