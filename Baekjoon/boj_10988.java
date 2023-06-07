package private_algorithm.Baekjoon;
import java.util.*;

public class boj_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int strLen = str.length();
		
		for(int i=0; i<strLen-1; i++) {
			if(str.charAt(i) != str.charAt(strLen-i-1)) { //하나라도 같지 않으면 0 출력 후 종료
				System.out.println(0);
				return;
			}
		}
		
		System.out.println(1); //종료되지 않았으면 같은 것이므로 1 출력 
	}
}
// 팰린드롬인지 

