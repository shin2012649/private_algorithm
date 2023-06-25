import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[N + 1];
        int count = dfs(graph, visited, 1);

        System.out.println(count - 1);
    }

    public static int dfs(List<List<Integer>> graph, boolean[] visited, int start) {
        visited[start] = true;
        int count = 1;

        for (int next : graph.get(start)) {
            if (!visited[next]) {
                count += dfs(graph, visited, next);
            }
        }

        return count;
    }
}
