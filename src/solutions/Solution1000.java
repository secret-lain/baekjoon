package solutions;

import java.util.Scanner;
import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/1000
 * A+B
 * 
 * */
public class Solution1000 extends SolutionAbs{
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(a + b);
	}

}
