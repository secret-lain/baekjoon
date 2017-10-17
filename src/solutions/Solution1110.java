package solutions;

import java.util.Scanner;

import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/1110
 * 더하기 사이클
 * 
 * */
public class Solution1110 extends SolutionAbs {
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);

		int input = in.nextInt();

		int prev = -1;
		int next = -1;
		int cnt = 0;

		while (prev * 10 + next != input) {
			if (cnt == 0) {
				prev = input / 10;
				next = input % 10;
			}

			cnt++;

			int nextTmp = next;
			next = (prev + next) % 10;
			prev = nextTmp;
		}

		System.out.println(cnt);
	}
}
