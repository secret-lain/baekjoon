package baekjoon;

import java.util.Scanner;
import solutions.interfaces.Solution;

/*
����� ���ø�
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ����� �Է��ؼ� ����!
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
			String className = "1002";
					
			
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