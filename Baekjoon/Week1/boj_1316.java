package private_algorithm.Baekjoon.Week1;
import java.util.*;
 
public class boj_1316{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int wordCount = sc.nextInt();
        int gwCount = 0;
        for(int i = 0; i < wordCount; i++){
            if(check() == true){
                gwCount++;   
            }
        }
        
        System.out.println(gwCount);
    }
    
    public static boolean check(){
        boolean[] alp = new boolean[26];
        int prv = 0;
        
        String s = sc.next();
        
        for(int i = 0; i < s.length(); i++){
            int now = s.charAt(i);
            
            if(prv != now){
                if(alp[now - 'a'] == false){
                    alp[now - 'a'] = true;
                    prv = now;
                }
                else{
                    return false;
                }
            }
        }
        
        return true;
        
        
    }
}

// 그룹 단어 체크 

