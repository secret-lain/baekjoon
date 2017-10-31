package solutions;

import java.util.HashMap;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/10250
 * ACM хёез
 * @author lain
 *
 */
public class Solution10250 implements Solution{
	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);
		
		int testcase = in.nextInt();
		while(testcase --> 0) {
			int h = in.nextInt();
			int w = in.nextInt();
			int n = in.nextInt();
			
			int x = (n%h) == 0 ? h : (n%h);
			int y = 1 + (n/h) - ((n%h)==0?1:0);
			System.out.println(x + "" + String.format("%02d", y));
		}
	}
}
