class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
                if(Character.isLowerCase(c)){
                    sb.setCharAt(i,Character.toUpperCase(c));
                }else if (Character.isUpperCase(c)){
                    sb.setCharAt(i, Character.toLowerCase(c));
                }     }
        
        return sb.toString();
    }
}