package solutions;

import java.util.Scanner;

import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/2293
 * 동전 1
 * 
 * */
public class Solution2293 extends SolutionAbs {
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int s = in.nextInt();

		int[] coin = new int[n];
		int[] dp = new int[s + 1];

		for (int i = 0; i < n; i++) {
			coin[i] = in.nextInt();
		}

		dp[0] = 1; // 최초 시작점
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= s; j++) {
				if (j - coin[i] >= 0)
					dp[j] += dp[j - coin[i]];
			}
		}
		System.out.println(dp[s]);
	}
}
