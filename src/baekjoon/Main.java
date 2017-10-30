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
		int[][] arr = new int[15][15];
		for(int i = 0 ; i < 15 ; i++) {
			arr[0][i] = i+1;
			arr[i][0] = 1;
		}
		
		int testcase = in.nextInt();
		int[][] cases = new int[testcase][2];
		int maxK = -1;
		int maxN = -1;
		for(int i = 0 ; i < testcase ; i++) {
			cases[i][0] = in.nextInt();
			cases[i][1] = in.nextInt();
			if(cases[i][0] > maxK) maxK = cases[i][0];
			if(cases[i][1] > maxN) maxN = cases[i][1];
		}
		
		for(int i = 1 ; i <= maxK ; i++) {
			for(int j = 1 ; j <= maxN ; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		for(int i = 0 ; i < testcase ; i++) {
			System.out.println(arr[cases[i][0]][cases[i][1] - 1]);
		}
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
			String className = "2775";

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