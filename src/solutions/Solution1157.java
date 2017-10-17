package solutions;

import java.util.Scanner;

import solutions.interfaces.SolutionAbs;

/*
 * https://www.acmicpc.net/problem/1157
 * 단어 공부
 * 
 * */
public class Solution1157 extends SolutionAbs {

	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);

		int[] alphabets = new int[26];
		in.useDelimiter("");

		while (in.hasNext()) {
			char curr = in.next().charAt(0);

			if (curr == '\r' || curr == '\n')
				break;
			if ((int) curr < 97)
				curr += 32;
			curr -= 97;

			alphabets[curr]++;
		}

		int max = -1;
		int index = 0;
		boolean isMultiple = false;
		for (int i = 0; i < 26; i++) {
			if (alphabets[i] > max) {
				max = alphabets[i];
				index = i;
				isMultiple = false;
			} else if (alphabets[i] == max) {
				isMultiple = true;
			}
		}

		if (isMultiple)
			System.out.println("?");
		else {
			System.out.println((char) (index + 65));
		}
	}
}
