package solutions;

import java.util.Scanner;

import solutions.interfaces.SolutionAbs;

public class SolutionNexon201710_3 extends SolutionAbs {
	
	@Override
	public void setSolvingCode() {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		int max = 0;
		
		if(input.charAt(input.length() - 1) == '1' && input.charAt(0) == '1') {
			int index = input.length() - 1;
			while(index > 0) {
				long decimal = 0;
				int powIndex = -1;
				for(int j = index ; j >= 0 ; j--) {
					powIndex++;
					if(input.charAt(j) == '0') continue;
					
					decimal += (long)(Math.pow(2, powIndex));
					double tmpDecimal = (double)decimal;
					while(tmpDecimal > 1.0) tmpDecimal /= 5.0;
					
					if(tmpDecimal == 1.0) {
						index = j - 1;
					}
				}
				
				max++;
			}
		}		
		
		System.out.println(max == 0 ? -1 : max);
	}
}
