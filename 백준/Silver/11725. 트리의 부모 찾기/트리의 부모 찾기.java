import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N; // 노드 개수 
    static int[] P; // 부모 노드 
    static boolean[] V; // 방문 
    static StringTokenizer st;
    static ArrayList<Integer>list[]; // 노드 저장할 곳 
    
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      N = Integer.parseInt(br.readLine());
      V = new boolean[N + 1];
      list = new ArrayList[N + 1];
      P = new int[N + 1];
      
      for(int i = 0; i < N + 1; i++) {
        list[i] = new ArrayList<>();
      }
      
      for (int i = 0; i < N-1; i++) {
        st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        list[a].add(b);
        list[b].add(a);
      }
      
      dfs(1);
      for(int i = 2; i < P.length; i++) {
        System.out.println(P[i]);
      }
      
      
    }

    private static void dfs(int I) {
      V[I] = true;
      for(int i : list[I]) {
        if(!V[i]) {
          P[i]=I;
          dfs(i);
        }
      }
    }
}