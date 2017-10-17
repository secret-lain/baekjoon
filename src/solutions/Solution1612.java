package solutions;

import java.util.Scanner;
import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/1612
 * 가지고 노는 1
 * 
 * */
public class Solution1612 extends SolutionAbs {
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);

		int input = Integer.valueOf(in.nextInt());

		if (input % 2 == 0 || input % 5 == 0) {
			System.out.println(-1);
		} else {
			int cnt = 1;
			int one = 1;

			while (one % input != 0) {
				one %= input;
				one = one * 10 + 1;
				cnt++;
			}

			System.out.println(cnt);
		}
	}
}
