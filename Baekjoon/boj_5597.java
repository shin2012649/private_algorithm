package private_algorithm.Baekjoon;
import java.util.Scanner;

public class boj_5597{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int[] Num = new int[31];
        
        for(int i=1; i<29; i++) {
            int safe = sc.nextInt();
            Num[safe] = 1;
        }
        for(int i =1; i< Num.length; i++){
            if(Num[i]!=1 )
                System.out.println(i);
        }
        sc.close();
    }
}

