package solutions;

import java.text.Collator;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import solutions.interfaces.Solution;

public class Solution1181 implements Solution {

	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.nextLine();
		TreeSet<String> checker = new TreeSet<>(new Comparator<String>() {
			Collator coll = Collator.getInstance();
			@Override
			public int compare(String o1, String o2) {				
				if(o1.length() < o2.length()) return -1;
				else if(o1.length() > o2.length()) return 1;
				else {
					return coll.compare(o1, o2);					
				}
			}
		});
		
		for(int i = 0 ; i < n ; i++) {
			checker.add(in.nextLine());
		}
		
		for(String item : checker) {
			System.out.println(item);
		}
	}

}
