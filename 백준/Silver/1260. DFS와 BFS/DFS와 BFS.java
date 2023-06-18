import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, M, V; // 정점의 개수, 간선의 개수, 시작 정점
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 정점의 개수
        M = sc.nextInt(); // 간선의 개수
        V = sc.nextInt(); // 시작 정점

        // 그래프 초기화
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력 받기
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 그래프 정점 순서대로 정렬
        for (int i = 1; i <= N; i++) {
            graph.get(i).sort(null);
        }

        // DFS 수행
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        // BFS 수행
        visited = new boolean[N + 1];
        bfs(V);

        sc.close();
    }

    // DFS 함수
    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int next : graph.get(v)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    // BFS 함수
    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int next : graph.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
