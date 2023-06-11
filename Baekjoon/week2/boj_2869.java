package private_algorithm.Baekjoon.Week2;
import java.util.Scanner;


public class boj_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        
        int days = (V - A) / (A - B); // 필요한 날 수 계산
        
        if ((V - A) % (A - B) > 0) { // 나머지가 0보다 크면 하루를 더 이동
            days++;
        }
        
        days++; // 정상에 도달하기 위한 마지막 이동
        
        System.out.println(days);
    }
}
// 달팽이 올라가고 싶다.
