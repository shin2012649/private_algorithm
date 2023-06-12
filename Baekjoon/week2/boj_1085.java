package private_algorithm.Baekjoon.Week2;

import java.util.Scanner;

public class boj_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int minDistance = Integer.MAX_VALUE;

        if (x < minDistance)
            minDistance = x;
        if (y < minDistance)
            minDistance = y;
        if (w - x < minDistance)
            minDistance = w - x;
        if (h - y < minDistance)
            minDistance = h - y;

        System.out.println(minDistance);
    }
}

    // 직사각형 탈출 
    
