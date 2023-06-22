class Solution {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= myString.length(); i++){
            if(myString.substring(0, i).endsWith(pat)) {
                sb.setLength(0);
                sb.append(myString.substring(0, i).toString());
            }
        }
            return sb.toString();
    }
}


