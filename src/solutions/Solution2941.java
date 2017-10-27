package solutions;

import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/2941
 * 크로아티아 알파벳
 * @author lain
 *
 */
public class Solution2941 implements Solution {

	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);
		String[] croatia = new String[] {"c=", "c-", "dz=","d-", "lj", "nj", "s=", "z="};
		String input = in.nextLine();
		int result = 0;
		
		for(int i = 0 ; i < croatia.length ; i++) {
			while(input != "" && input.contains(croatia[i])) {
				input = input.replaceFirst(croatia[i], "0");
				result++;
			}
		}
		input = input.replaceAll("0","");
		System.out.println(result + input.length());
	}

}
