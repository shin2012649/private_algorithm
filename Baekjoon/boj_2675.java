package private_algorithm.Baekjoon;
import java.util.Scanner;

class boj_2675{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 테스트 케이스의 개수
    int T = sc.nextInt();
    // 반복횟수
    int R;
    // 문자형 배열
    String S;

    for(int i=0;i<T;i++){
      R = sc.nextInt();
      S = sc.next();
      for(int x=0, cnt=S.length();x<cnt;x++){
        for(int y=0;y<R;y++){
          System.out.print(S.charAt(x));
        }
      }
      System.out.println();
    }
  }
}

// 문자열 반복 
