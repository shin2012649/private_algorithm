class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String MS = myString.toLowerCase();
        String PA = pat.toLowerCase();

        if (MS.length() < PA.length()) {
            return answer;
        }

        for (int i = 0; i <= MS.length() - PA.length(); i++) {
            String substring = MS.substring(i, i + PA.length());
            if (substring.equals(PA)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}
