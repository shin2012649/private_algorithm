class Solution {
    public boolean solution(String s) {
        // 문자열의 길이가 4 또는 6이 아니면 false를 반환
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        // 문자열을 순회하면서 숫자로만 구성되어 있는지 확인
        for (char c : s.toCharArray()) {
            // 숫자가 아닌 문자가 하나라도 있으면 false를 반환
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        // 문자열이 길이가 4 또는 6이고, 숫자로만 구성되어 있으면 true를 반환
        return true;
    }
}
