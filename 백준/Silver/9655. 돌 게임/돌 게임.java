import java.util.*;
import java.io.*;
 
 
public class Main {
 
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
 
        System.out.println(Winner(n));
    }
 
    public static String Winner(int num){
        return num%2==1 ? "SK" :"CY";
    }
}