package solutions;

import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/5622
 * ´ÙÀÌ¾ó
 * @author lain
 *
 */
public class Solution5622 implements Solution {

	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[] {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		char[] input = in.nextLine().toCharArray();
		int sum = 0;
		
		for(int i = 0 ; i < input.length ; i++) {
			int a = input[i];
			sum += arr[input[i] - 65];
		}
		
		System.out.println(sum);
	}

}
