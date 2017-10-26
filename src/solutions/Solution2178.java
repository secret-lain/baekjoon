package solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/2178 ¹Ì·Î Å½»ö
 * 
 * @author lain
 *
 */
public class Solution2178 implements Solution {
	@Override
	public void solve() {
	class Point {
		public int x;
		public int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int m = in.nextInt();
	int[][] map = new int[n][m];
	boolean[][] visit = new boolean[n][m];
	Queue<Point> bfsQueue = new LinkedList<>();

	in.nextLine();
	for (int i = 0; i < n; i++) {
		String line = in.nextLine();
		for (int j = 0; j < m; j++) {
			map[i][j] = Integer.valueOf(line.charAt(j) - 48);
		}
	}

	bfsQueue.add(new Point(0, 0));
	while (false == bfsQueue.isEmpty()) {
		Point curr = bfsQueue.poll();
		visit[curr.x][curr.y] = true;

		if (curr.x + 1 < n && map[curr.x + 1][curr.y] != 0
				&& map[curr.x + 1][curr.y] <= map[curr.x][curr.y] && !visit[curr.x + 1][curr.y]) {
			map[curr.x + 1][curr.y] = map[curr.x][curr.y] + 1;
			bfsQueue.add(new Point(curr.x + 1, curr.y));
		}
		if (curr.x - 1 >= 0 && map[curr.x - 1][curr.y] != 0
				&& map[curr.x - 1][curr.y] <= map[curr.x][curr.y] && !visit[curr.x - 1][curr.y]) {
			map[curr.x - 1][curr.y] = map[curr.x][curr.y] + 1;
			bfsQueue.add(new Point(curr.x - 1, curr.y));
		}
		if (curr.y + 1 < m && map[curr.x][curr.y + 1] != 0
				&& map[curr.x][curr.y + 1] <= map[curr.x][curr.y] && !visit[curr.x][curr.y + 1]) {
			map[curr.x][curr.y + 1] = map[curr.x][curr.y] + 1;
			bfsQueue.add(new Point(curr.x, curr.y + 1));
		}
		if (curr.y - 1 >= 0 && map[curr.x][curr.y - 1] != 0
				&& map[curr.x][curr.y - 1] <= map[curr.x][curr.y] && !visit[curr.x][curr.y - 1]) {
			map[curr.x][curr.y - 1] = map[curr.x][curr.y] + 1;
			bfsQueue.add(new Point(curr.x, curr.y - 1));
		}
	}
	
	System.out.println(map[n-1][m-1]);
	}

}
