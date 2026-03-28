import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main
{
	static int M;
	static int N;
	
	static int[][] box;
	static int[][] days;
	
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		box = new int[M][N];
		days = new int[M][N];
		
		Queue<int[]> queue = new LinkedList<int[]>();
		
		for (int i = 0; i < M; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < N; j++)
			{
				box[i][j] = Integer.parseInt(st.nextToken());
				
				if (box[i][j] == -1)
				{
					days[i][j] = -1;
				}
				
				if (box[i][j] == 1)
				{
					queue.add(new int[] { i, j });
					days[i][j] = 1;
				}
			}
		}
		
		bfs(queue);
		
		int max = 0;
		boolean check = false;
		
		for (int i = 0; i < M; i++)
		{
			for (int j = 0; j < N; j++)
			{
				if (days[i][j] == 0)
				{
					check = true;
					break;
				}
				
				max = Math.max(max, days[i][j]);
			}
		}
		
		if (check == true)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(max - 1);
		}
	}
	
	private static void bfs(Queue<int[]> queue)
	{
		while (queue.isEmpty() == false)
		{
			int[] now = queue.remove();
			
			int y = now[0];
			int x = now[1];
			
			for (int i = 0; i < 4; i++)
			{
				int nextY = y + dy[i];
				int nextX = x + dx[i];
				
				if (nextY < 0 || nextX < 0 || nextY >= M || nextX >= N)
				{
					continue;
				}
				
				if (box[nextY][nextX] == 0 && days[nextY][nextX] == 0)
				{
					days[nextY][nextX] = days[y][x] + 1;
					queue.add(new int[] { nextY, nextX });
				}
			}
		}
	}
}