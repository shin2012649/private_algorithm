package private_algorithm.Baekjoon;
import java.util.Scanner;
public class boj_4344 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for (int i = 0; i < C; i++) {
			int N = sc.nextInt();
			int[] scores = new int[N];
			double cnt = 0;
			double sum = 0;
			double avr = 0;
			
			// 점수 입력
			for (int j = 0; j < N; j++) {
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			avr = sum/N; // 평균
			
			// 평균 넘는 학생 수 카운트
			for (int j = 0; j < N; j++) {
				if(scores[j] > avr) cnt++;
			}
			System.out.println(String.format("%.3f", cnt/N*100,3)+"%");
		}
	}
}

// 평균은 넘겠지 