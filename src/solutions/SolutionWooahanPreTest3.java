package solutions;

import java.util.ArrayList;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * ��� ���ϱ� ���� ������ �Է� �ް� �� ���� ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
 * 
 * �Է�
 * 
 * ���� ����
 * 
 * ���
 * 
 * �Էµ� ���� ����� �������� �����Ͽ� ���
 * 
 * 
 * ���� �Է� 1 20 ��� 1 1 2 4 5 10 20
 * 
 * ���� �Է� 2 100 ��� 2 1 2 4 5 10 20 25 50 100
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
