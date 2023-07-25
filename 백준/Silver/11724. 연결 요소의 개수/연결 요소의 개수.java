import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N; // 정점 개수 
    static int M; // 간선 개수 
    static boolean[] V; // 방문 체크 
    static ArrayList<Integer>list[]; 
    
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      N = Integer.parseInt(st.nextToken());
      M =  Integer.parseInt(st.nextToken());
      list = new ArrayList[N + 1];
      V = new boolean[N + 1];
      
      int count = 0; // 연결 요소 개수 
      for(int i = 0; i < list.length; i++) {
        list[i] = new ArrayList<>();
      }
      
      // 인접행렬  입력 
      
      for (int i = 0; i < M; i++) {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        list[a].add(b);
        list[b].add(a);
}
    
      
      for(int i = 1; i < N + 1; i++) {
        if(!V[i] ) {
          dfs(i);
          count++;
        }
      }
      
      System.out.println(count);
    }

    private static void dfs(int I) {
      V[I] = true;
      for(int i : list[I]) {
        if(!V[i]) {
          dfs(i);
        }
      }
    }
}