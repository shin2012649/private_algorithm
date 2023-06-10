package private_algorithm.Baekjoon.Week1;
import java.util.Scanner;

public class boj_2438{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
       int i = 1;
       while (i <= N) {
           int j = 1;
           while (j <= i) {
               System.out.print("*");
               j++;
           }
           System.out.println();
           i++;
       }
    }
}


// 별찍기 

