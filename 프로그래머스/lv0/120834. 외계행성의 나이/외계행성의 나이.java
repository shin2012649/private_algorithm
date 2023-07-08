class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        while (age > 0) {
            int A = age % 10;
            char ch = (char) ('a' + A);
            sb.insert(0, ch);
            age /= 10;
        }
        return sb.toString();
    }
}
