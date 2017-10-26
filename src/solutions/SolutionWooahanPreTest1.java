package solutions;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * 
 * �Ʒ��� ������ �����ϴ� �ش� ����(leap year)�̶�� �մϴ�.
 * 
 * ���±������ ������ 4�� ������ �������� �ش� �������� �Ѵ�.(2004��, 2008��, 2012��, 2016��, 2020�⡦) �� �߿���
 * 100���� ������ �������� �ش� ������� �Ѵ�.(1900��, 2100��, 2200��, 2300�⡦) ���߿� 400���� ������ �������� �ش�
 * �������� �д�.(1600��, 2000��, 2400�� ��) ������ �Է¹ް� �������� �ƴ����� �����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
 * 
 * 
 * 
 * �Է�
 * 
 * �⵵(0�� �̻�)
 * 
 * ���
 * 
 * ������ ��� Leap Year
 * 
 * ����� ��� Not Leap Year
 * 
 * ���� �Է� 1 2000 ��� 1 Leap Year
 * 
 * ���� �Է� 2 2100 ��� 2 Not Leap Year
 * 
 * @author lain
 *
 */
public class SolutionWooahanPreTest1 implements Solution {

	@Override
	public void solve() {
		Scanner in = new Scanner(System.in);

		int input = in.nextInt();
		if (input % 400 == 0 || (input % 4 == 0 && input % 100 != 0)) {
			System.out.println("Leap Year");
		} else
			System.out.println("Not Leap Year");
	}

}
