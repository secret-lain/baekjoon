package solutions;

import java.util.HashMap;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/1011
 * Fly me to the Alpha Centauri
 * @author lain
 *
 */
public class Solution1011 implements Solution {
	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);
		HashMap<Long, Integer> memory = new HashMap<>();
		int testcase = in.nextInt();
		while(testcase --> 0) {
			long curr = in.nextLong() + 1;
			long dest = in.nextLong();
			int result = 1;
			int k = 1;
			int ksum = 1;
			long key = dest-curr;

			if(memory.containsKey(key)) {
				System.out.println(memory.get(key));
			} else {
				while(curr < dest) {
					if(dest-curr > ksum + 1) {
						ksum += k;
						k += 1;
					} else {
						if(k > 1) {
							ksum -= k;
							k -= 1;
						}
					}
					curr += k;
					result++;
				}
				memory.put(key, result);
				System.out.println(result);
			}
		}		
	}
}
