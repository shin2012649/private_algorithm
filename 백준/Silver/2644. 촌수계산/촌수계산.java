import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 전체 사람의 수
        int a = scanner.nextInt(); // 촌수를 계산할 사람 1
        int b = scanner.nextInt(); // 촌수를 계산할 사람 2
        int m = scanner.nextInt(); // 가족 관계의 수

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[a] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph[current]) {
                if (dist[next] == -1) {
                    queue.offer(next);
                    dist[next] = dist[current] + 1;
                }
            }
        }

        System.out.println(dist[b]);
    }
}
