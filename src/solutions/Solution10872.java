package solutions;

import java.util.Scanner;

import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/10872
 * ÆÑÅä¸®¾ó
 * 
 * */
public class Solution10872 extends SolutionAbs {
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int result = 1;
		for (int i = n; i >= 1; i--) {
			result *= i;
		}

		System.out.println(result);
	}
}
