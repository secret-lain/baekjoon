package solutions;

import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * 
 * �Է� ���� 10������ 16������ ����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
 * 
 * 
 * 
 * �Է�
 * 
 * 10 ���� �� ����
 * 
 * ���
 * 
 * 16������ ��ȯ�� �Է�
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
