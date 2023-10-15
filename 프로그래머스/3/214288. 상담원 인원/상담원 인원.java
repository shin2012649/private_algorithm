import java.util.*;
class Solution {
    public int solution(int k, int n, int[][] reqs) {
        int answer = 0;
        ArrayList<ArrayList<Node>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for(int[] i : reqs) {
            list.get(i[2]).add(new Node(i[0],i[1]));
        }
        int[][] sum_wait = new int[k+1][n-k+2];
        for(int i = 1; i <= k; i++) {     
            for(int j = 1; j <= n-k+1; j++) {
                PriorityQueue<Integer> que = new PriorityQueue<>();
                for(Node nk : list.get(i)) {
                    if(que.size() < j) {
                        que.add(nk.start + nk.time);
                    }
                    else {
                        int min = que.poll();
                        int wait = min - nk.start;
                        if(wait > 0) {
                            sum_wait[i][j] += wait;
                            que.add(min+nk.time);
                        }
                        else {
                            que.add(nk.start + nk.time);
                        }
                    }
                }
            }
        }
        answer = dfs(n-k+1, sum_wait, 1, k);
        return answer;
    }
    static int dfs(int remain, int[][] wait, int depth, int k) {
        if(depth > k) return 0;
        int sum = 100000000;
        for(int i = 1; i <= remain; i++) {
            sum = Math.min(dfs(remain-i+1, wait, depth+1, k)+wait[depth][i], sum);
        }
        return sum;
    }
    static class Node {
        int start;
        int time;
        Node(int start, int time) {
            this.start = start;
            this.time = time;
        }
    }
}