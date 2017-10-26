package solutions;

import java.util.HashMap;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * https://www.acmicpc.net/problem/1316
 * 그룹 단어 체커
 * @author lain
 *
 */
public class Solution1316 implements Solution{
	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);
		
		int count = Integer.valueOf(in.nextLine());
		int result = 0;
		for(int i = 0 ; i < count ; i++) {
			char[] target = in.nextLine().toCharArray();
			HashMap<Character, Integer> map = new HashMap<>();
			int index = 0;
			boolean isGroup = true;
			
			while(index < target.length) {
				if(!map.containsKey(target[index])) {
					map.put(target[index], 1);
					int fixedIndex = index++;
					while(index < target.length && target[fixedIndex] == target[index]) index++;
				} else{
					isGroup = false;
					break;
				}
			}
			if(isGroup) result++;
		}
		
		System.out.println(result);
	}
}
