package solutions;

import java.util.Scanner;
import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/1085
 * 직사각형에서 탈출
 * 
 * */
public class Solution1085 extends SolutionAbs {
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();

		int vert = -1;
		int hori = -1;

		if (x > w / 2)
			hori = Math.abs(w - x);
		else
			hori = x;

		if (y > h / 2)
			vert = Math.abs(h - y);
		else
			vert = y;

		System.out.println(hori > vert ? vert : hori);
	}

}
