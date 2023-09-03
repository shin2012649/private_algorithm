
import java.util.Stack;

public class RemoveGroup {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("baabaa"));
		System.out.println(s.solution("cdcd"));
	}
}

class Solution {
	public int solution(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(!stack.isEmpty() && stack.peek() == ch) stack.pop();
			else stack.push(ch);
		}

		return stack.isEmpty() ? 1 : 0;
	}
}