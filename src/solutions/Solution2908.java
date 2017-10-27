package solutions;

import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/2908
 * »ó¼ö
 * @author lain
 *
 */
public class Solution2908 implements Solution {

	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);
		
		String a = String.valueOf(in.nextInt());
		String b = String.valueOf(in.nextInt());
		
		StringBuilder builder = new StringBuilder(a);
		a = builder.reverse().toString();
		
		builder.delete(0, builder.length());
		builder.append(b);
		b = builder.reverse().toString();
		
		if(Integer.valueOf(a) > Integer.valueOf(b))
			System.out.println(a);
		else System.out.println(b);
		
		
		
		
	}

}
