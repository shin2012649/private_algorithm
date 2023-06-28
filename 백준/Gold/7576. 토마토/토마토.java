import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato {
    int x;
    int y;

    public Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int[][] box;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static int M, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int days = bfs();
        System.out.println(days);
    }

    public static int bfs() {
        Queue<Tomato> queue = new LinkedList<>();

        // 익은 토마토 위치를 큐에 추가
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    queue.add(new Tomato(j, i));
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];

                // 상자 범위를 벗어나는 경우 무시
                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }

                // 익지 않은 토마토인 경우 익게 만들고 큐에 추가
                if (box[ny][nx] == 0) {
                    box[ny][nx] = box[tomato.y][tomato.x] + 1;
                    queue.add(new Tomato(nx, ny));
                }
            }
        }

        int maxDays = 0;
        // 아직 익지 않은 토마토가 있는지 확인하고 최대 일수를 찾음
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return -1; // 익지 않은 토마토가 남아있는 경우
                }
                maxDays = Math.max(maxDays, box[i][j]);
            }
        }

        return maxDays - 1; // 첫날은 1일이므로 1을 빼줌
    }
}
