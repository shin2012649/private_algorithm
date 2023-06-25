import java.util.*;

public class Main {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = scanner.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        boolean[][] visited = new boolean[N][N];
        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    counts.add(dfs(map, visited, i, j));
                }
            }
        }

        System.out.println(counts.size());
        Collections.sort(counts);
        for (int count : counts) {
            System.out.println(count);
        }
    }

    public static int dfs(int[][] map, boolean[][] visited, int x, int y) {
        int count = 1;
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    count += dfs(map, visited, nx, ny);
                }
            }
        }

        return count;
    }
}
