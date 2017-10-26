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

		int n = in.nextInt();
		List<List<String>> list = new ArrayList<>();
		HashSet<String> checker = new HashSet<>();
		
		for(int i = 0 ; i < 50 ; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i = 0 ; i < n ; i++) {
			String item = in.nextLine();
			if(checker.contains(item)) continue;
			else {
				checker.add(item);
				list.get(item.length()).add(item);
			}
		}
		
		for(List<String> arr : list) {
			Collections.sort(arr, Collator.getInstance());
			for(String item : arr) {
				System.out.println(item);
			}
		}
    }
}

 */
@SuppressWarnings("rawtypes")
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {			
			//��Ű�� ��ġ
			String classNamePrefix = "solutions.Solution";
			
			//�׽�Ʈ�� �� �κ��� ���������� ����
			System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
//			String className = in.nextLine();
			String className = "1181";
					
			
			//Ŭ������ ���÷����� ���� �����Ѵ�. �߸��� ������ ��� ���� �߻�.
			Class solutionClass = Class.forName(classNamePrefix + className);
			Object solutionObject = solutionClass.newInstance();
			
			// RealSolutionClass �� �ν��Ͻ��� �������ϴ��� Ȯ���Ѵ�. solve�� ���� �� �������� �ʸ� ��� �����Ѵ�.
			if(solutionObject instanceof Solution) {
				printProblemStartedMsg();
				((Solution)solutionObject).solve();
			} else throw new IllegalAccessException();			
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� �ַ�� ���� �������� �ʽ��ϴ�.");
			//e.printStackTrace();
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