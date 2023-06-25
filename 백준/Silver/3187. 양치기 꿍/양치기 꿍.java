import java.io.*;
import java.util.*;

public class Main {
	public static int[] dx = {-1,0,1,0};
	public static int[] dy = {0,1,0,-1};
	public static boolean visit[][];
	public static char map[][];
	public static int R, C;
	public static Queue<int[]> q;
	public static Queue<int[]> wolflist;
	
	public static int wolf, sheep;
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		visit = new boolean[R][C];
		map = new char[R][C];
		q = new LinkedList<>();
		wolflist = new LinkedList<>();
		
		for (int i = 0; i < R; i++) {
			char[] ch = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				map[i][j] = ch[j];
				if(map[i][j] == 'v') {
					wolf++;
					wolflist.add(new int[] {i,j});
				}
				if(map[i][j] == 'k') sheep++;
			}
		}
		
		int qsize = wolflist.size();
		for (int i = 0; i < qsize; i++) {
			int[] pos = wolflist.poll();
			if(!visit[pos[0]][pos[1]]) {
				visit[pos[0]][pos[1]] = true;
				q.add(new int[] {pos[0],pos[1]});
				bfs();
			}
		}
		System.out.println(sheep + " " + wolf);
	}
	public static void bfs() {
		int w=1,s=0;
		
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = pos[0] + dx[i];
				int ny = pos[1] + dy[i];
				
				if(check(nx,ny)) continue;
				if(visit[nx][ny] || map[nx][ny] == '#') continue;
				
				if     (map[nx][ny] == 'v') w++;
				else if(map[nx][ny] == 'k') s++;
					 
				visit[nx][ny] = true;
				q.add(new int[] {nx,ny});
			}
		}
		
		if(w>=s) sheep -= s;
		else     wolf -= w;
		
	}
	public static boolean check(int nx, int ny) {
		return nx < 0 || nx >= R || ny < 0 || ny >=C;
	}

}

