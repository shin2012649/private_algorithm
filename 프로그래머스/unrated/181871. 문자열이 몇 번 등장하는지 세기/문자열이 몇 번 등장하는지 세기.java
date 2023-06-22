class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int P = pat.length();
        StringBuilder sb = new StringBuilder(myString);
        
        for (int i = 0; i <= sb.length() - P; i++) {
            if (sb.substring(i, i + P).equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}
