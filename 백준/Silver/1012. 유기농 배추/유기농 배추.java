import java.util.*;

public class Main {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수

        while (T-- > 0) {
            int M = scanner.nextInt(); // 배추 밭의 가로 길이
            int N = scanner.nextInt(); // 배추 밭의 세로 길이
            int K = scanner.nextInt(); // 배추의 개수

            int[][] field = new int[N][M];
            boolean[][] visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                int X = scanner.nextInt(); // 배추의 x좌표
                int Y = scanner.nextInt(); // 배추의 y좌표
                field[Y][X] = 1;
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (field[i][j] == 1 && !visited[i][j]) {
                        dfs(field, visited, i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int[][] field, boolean[][] visited, int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < field.length && ny >= 0 && ny < field[0].length) {
                if (field[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(field, visited, nx, ny);
                }
            }
        }
    }
}
