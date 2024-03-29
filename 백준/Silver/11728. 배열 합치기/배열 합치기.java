import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열 A
        int M = Integer.parseInt(st.nextToken()); // 배열 B

        List<Integer> A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            A.add(n);
        }

        List<Integer> B = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(st.nextToken());
            B.add(n);
        }

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < N && j < M) {
            int a = A.get(i);
            int b = B.get(j);

            if (a <= b) {
                result.add(a);
                i++;
            } else {
                result.add(b);
                j++;
            }
        }
        // 인덱스가 남아있는 경우
        for (; i < N; i++) {
            result.add(A.get(i));
        }
        for (; j < M; j++) {
            result.add(B.get(j));
        }

        StringBuilder sb = new StringBuilder();
        for (int e : result) {
            sb.append(e).append(" ");
        }
        System.out.println(sb.toString());

        br.close();
    }
}
