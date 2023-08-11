import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] tree;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        // 이진 트리
        tree = new int[n][2];

        // 입력값으로 이진 트리 만들기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 부모, 자식 왼쪽, 자식 오른쪽 노드 만들기
            // tree 배열에 0번째부터 위치시키기 위해 'A' 뺌
            int parentNode = st.nextToken().charAt(0) - 'A';
            int leftNode = st.nextToken().charAt(0) - 'A';
            int rightNode = st.nextToken().charAt(0) - 'A';

            // . 에서 'A' 빼면 -19
            tree[parentNode][0] = (leftNode == -19) ? -1 : leftNode;
            tree[parentNode][1] = (rightNode == -19) ? -1 : rightNode;
        }

        // 순회 메서드 호출
        preOrder(0);
        sb.append("\n");
        inOrder(0);
        sb.append("\n");
        postOrder(0);

        System.out.println(sb);
    }

    // 전위 순회 메서드
    static void preOrder(int s) {
        if (s == -1) return;
        // 현재 노드 값 추가
        sb.append((char) (s + 'A'));
        // 왼쪽 자식 노드 호출
        preOrder(tree[s][0]);
        // 오른쪽 자식 노드 호출
        preOrder(tree[s][1]);
    }

    // 중위 순회 메서드
    static void inOrder(int s) {
        if (s == -1) return;
        // 왼쪽 자식 노드 호출
        inOrder(tree[s][0]);
        // 현재 노드 추가
        sb.append((char) (s + 'A'));
        // 오른쪽 자식 노드 호출
        inOrder(tree[s][1]);
    }

    // 후위 순회 메서드
    static void postOrder(int s) {
        if (s == -1) return;
        // 왼쪽 자식 노드 호출
        postOrder(tree[s][0]);
        // 오른쪽 자식 노드 호출
        postOrder(tree[s][1]);
        // 현재 노드 추가
        sb.append((char) (s + 'A'));
    }
}