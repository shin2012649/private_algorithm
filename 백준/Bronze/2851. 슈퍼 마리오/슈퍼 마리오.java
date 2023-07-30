import java.util.*;
import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {

    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int score = 0;
        int[] mushroom = new int[10];
        
        for(int i=0; i<10; i++)
            mushroom[i] = Integer.parseInt(br.readLine());
        
        for(int i=0; i<10; i++) {
            score += mushroom[i];
 
            if(Math.abs((score-mushroom[i])-100) < score-100) {
                score = score-mushroom[i];
                break;
            }
        }
        
        System.out.println(score);
    }
    
}