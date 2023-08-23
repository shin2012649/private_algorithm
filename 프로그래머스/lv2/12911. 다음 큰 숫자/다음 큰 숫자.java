class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int curOne = toBinary(n);
		
		while(true) {
			int nextOne = toBinary(++n);
			if(curOne == nextOne) break;
		}
		answer = n;
        
        return answer;
    }
    
    //2진수로 변환했을 때 1의 개수
	private static int toBinary(int n) {
		int one = 1;
		
		while(n > 1) {
			if(n % 2 == 1) {
				one++;
			}
			n /= 2;
		}
		
		return one;
	}
}