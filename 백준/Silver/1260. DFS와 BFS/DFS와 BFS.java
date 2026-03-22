import java.io.*;
import java.util.*;

public class Main {

    static int n, m, v;
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph[from][to] = 1;
            graph[to][from] = 1;
        }

        dfs(v);
        sb.append('\n');

        visited = new boolean[n + 1];
        bfs(v);

        System.out.println(sb);
    }

    static void dfs(int now) {
        visited[now] = true;
        sb.append(now).append(' ');

        for (int next = 1; next <= n; next++) {
            if (graph[now][next] == 1 && !visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now).append(' ');

            for (int next = 1; next <= n; next++) {
                if (graph[now][next] == 1 && !visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
    }
}