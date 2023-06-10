package private_algorithm.Baekjoon.Week1;
import java.util.Scanner;

public class boj_10810{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int B = sc.nextInt();
        int M = sc.nextInt();
        
        int[] BArray = new int[B];
        
        for(int i =0; i < M; i++){
            int from = sc.nextInt()-1;
            int to = sc.nextInt()-1;
            int ballNum = sc.nextInt();
        
        
        for(int j = from; j <= to; j++){
            BArray[j] = ballNum;
        }
    }
    
    for(int i = 0; i < B; i++){
        System.out.print(BArray[i] + " ");
       
        }
    }
}

// 공넣기 
