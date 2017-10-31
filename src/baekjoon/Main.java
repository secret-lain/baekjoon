package baekjoon;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import solutions.interfaces.Solution;

/*
����� ���ø�
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
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

 */
@SuppressWarnings("rawtypes")
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			// ��Ű�� ��ġ
			String classNamePrefix = "solutions.Solution";

			// �׽�Ʈ�� �� �κ��� ���������� ����
			System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
			// String className = in.nextLine();
			String className = "1475";

			// Ŭ������ ���÷����� ���� �����Ѵ�. �߸��� ������ ��� ���� �߻�.
			Class solutionClass = Class.forName(classNamePrefix + className);
			Object solutionObject = solutionClass.newInstance();

			// RealSolutionClass �� �ν��Ͻ��� �������ϴ��� Ȯ���Ѵ�. solve�� ���� �� �������� �ʸ� ��� �����Ѵ�.
			if (solutionObject instanceof Solution) {
				printProblemStartedMsg();
				((Solution) solutionObject).solve();
			} else
				throw new IllegalAccessException();
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� �ַ�� ���� �������� �ʽ��ϴ�.");
			// e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("�ַ�� ������Ʈȭ ����. �߸��� �����Դϴ�.");
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

	private static void printProblemStartedMsg() {
		System.out.println("������ ���۵Ǿ����ϴ�.. �Է°��� ������ �Է��ϼ���\n-----------------------------");
	}
}