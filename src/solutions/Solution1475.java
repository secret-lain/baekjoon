package solutions;

import java.util.HashMap;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/1475
 * ¹æ ¹øÈ£
 * @author lain
 *
 */
public class Solution1475 implements Solution {
	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		int max = 0;
		
		String digit = in.nextLine();
		for(int i = 0 ; i < digit.length() ; i++) {
			int curr = digit.charAt(i) - 48;
			
			if(curr == 6 || curr == 9) {
				if(arr[6] < arr[9]) {
					arr[6]++;
					if(max < arr[6]) max = arr[6];
				}
				else {
					arr[9]++;
					if(max < arr[9]) max = arr[9];
				}				
			} else {
				arr[curr]++;
				if(max < arr[curr]) max++;
			}
		}
		
		System.out.println(max);
	}
}
