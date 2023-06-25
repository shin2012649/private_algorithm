import java.util.*;

public class Main {
    private static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    private static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int W = scanner.nextInt(); // 지도의 너비
            int H = scanner.nextInt(); // 지도의 높이

            if (W == 0 && H == 0) {
                break;
            }

            int[][] map = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    map[i][j] = scanner.nextInt();
                }
            }

            boolean[][] visited = new boolean[H][W];
            int count = 0;

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        dfs(map, visited, i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int[][] map, boolean[][] visited, int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(map, visited, nx, ny);
                }
            }
        }
    }
}
