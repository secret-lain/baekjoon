package solutions;

import java.util.Scanner;
import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/11052
 * ºØ¾î»§ ÆÇ¸ÅÇÏ±â
 * 
 * */
public class Solution11052 extends SolutionAbs {
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] set = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			set[i] = in.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					dp[j] = Math.max(dp[j], dp[j - i] + set[i]);
				}
			}
		}

		System.out.println(dp[n]);
	}

}
