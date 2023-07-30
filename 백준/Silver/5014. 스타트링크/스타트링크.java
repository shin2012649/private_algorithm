import java.util.*;

public class Main {
	static int f,s,g,u,d;
	static int visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		f = sc.nextInt();//최고층
		s = sc.nextInt();//강호
		g = sc.nextInt();//가야할 곳
		u = sc.nextInt();//올라간다잉
		d = sc.nextInt();//내려간다잉
		visited = new int[f+1];
        
        	bfs(f,s,g,u,d);
	}
	
	static void bfs(int f, int s, int g, int u, int d) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited[s]=1;//1층으로 정하고 시작 
		
		while(!q.isEmpty()) {
			int c = q.poll();//현재위치
			
			if(c==g) {
				System.out.println(visited[c]-1);
			}
			
			if(c+u <= f && visited[c+u]==0) {
				visited[c+u]=visited[c]+1;
				q.add(c+u);
			}
			
			if(c-d > 0 && visited[c-d]==0) {
				visited[c-d] = visited[c]+1;
				q.add(c-d);
			}
			
		}
		
		if(visited[g]==0)
			System.out.println("use the stairs");
		
	}
}