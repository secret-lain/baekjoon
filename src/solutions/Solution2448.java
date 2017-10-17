package solutions;

import java.util.Scanner;

import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/2448
 * 별찍기 - 11
 * 
 * */
public class Solution2448 extends SolutionAbs {
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);
		String[] map;

		int n = in.nextInt();
		map = new String[n];

		map[0] = "  *  ";
		map[1] = " * * ";
		map[2] = "*****";

		for (int i = 1; 3 * (int) Math.pow(2, i) <= n; i++) {
			int border = 3 * (int) Math.pow(2, i);
			int half = border / 2;

			// 아래의 삼각형을 만들어준다.
			for (int j = border - 1; j >= half; j--) {
				map[j] = map[j - half] + " " + map[j - half];
			}

			// 위의 삼각형을 밀어준다
			String space = "";
			while (space.length() < half) {
				space += " ";
			}
			for (int j = half - 1; j >= 0; j--) {
				map[j] = space + map[j] + space;
			}
		}

		// print
		for (int i = 0; i < n; i++) {
			System.out.println(map[i]);
		}
	}
}
