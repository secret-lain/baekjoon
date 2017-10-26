package solutions;

import java.util.ArrayList;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * 약수 구하기 양의 정수를 입력 받고 그 수의 약수를 모두 출력하는 프로그램을 작성하십시오.
 * 
 * 입력
 * 
 * 양의 정수
 * 
 * 출력
 * 
 * 입력된 수의 약수를 공백으로 구분하여 출력
 * 
 * 
 * 보기 입력 1 20 출력 1 1 2 4 5 10 20
 * 
 * 보기 입력 2 100 출력 2 1 2 4 5 10 20 25 50 100
 * 
 * 
 * @author lain
 *
 */
public class SolutionWooahanPreTest3 implements Solution {

	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();
		int input = in.nextInt();

		int j = 1;
		int max = input;
		while (j < max) {
			if (input % j == 0) {
				arr.add(j);
				if (input / j != j)
					System.out.print(j + " ");
				max = input / j;
			}
			j++;
		}

		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.print((input / arr.get(i)) + " ");
		}
	}
}
