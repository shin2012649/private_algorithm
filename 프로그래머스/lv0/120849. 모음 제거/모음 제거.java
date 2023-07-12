class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] Five = {"a", "e", "i", "o", "u"};
        for(int i = 0; i<Five.length; i++) {
			if( my_string.contains(Five[i])) {
				answer = my_string.replaceAll(Five[i], "");
				my_string = answer;
			} else {
                answer = my_string;
            }
		}
        
        
        return answer;
    }
}