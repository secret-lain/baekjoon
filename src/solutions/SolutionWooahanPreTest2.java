package solutions;

import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * 
 * 입력 받은 10진수를 16진수로 출력하는 프로그램을 작성하십시오.
 * 
 * 
 * 
 * 입력
 * 
 * 10 진수 형 정수
 * 
 * 출력
 * 
 * 16진수로 변환된 입력
 * 
 * @author lain
 *
 */
public class SolutionWooahanPreTest2 implements Solution {

	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);

		int input = in.nextInt();
		System.out.println(Integer.toHexString(input));
	}

}
