package baekjoon;

import java.util.Scanner;
import solutions.interfaces.Solution;

/*
제출용 템플릿
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 여기다 입력해서 제출!
    }
}

 */
@SuppressWarnings("rawtypes")
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {			
			//패키지 위치
			String classNamePrefix = "solutions.Solution";
			
			//테스트시 이 부분을 고정값으로 변경
			System.out.print("문제 번호를 입력하세요 : ");
//			String className = in.nextLine();
			String className = "1002";
					
			
			//클래스를 리플렉션을 통해 생성한다. 잘못된 접근의 경우 에러 발생.
			Class solutionClass = Class.forName(classNamePrefix + className);
			Object solutionObject = solutionClass.newInstance();
			
			// RealSolutionClass 의 인스턴스가 정상동작하는지 확인한다. solve가 실행 된 순간부터 초를 재기 시작한다.
			if(solutionObject instanceof Solution) {
				printProblemStartedMsg();
				((Solution)solutionObject).solve();
			} else throw new IllegalAccessException();			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 솔루션 명은 존재하지 않습니다.");
			//e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("솔루션 오브젝트화 실패. 잘못된 접근입니다.");
			e.printStackTrace();
		} finally {
			in.close();
		}
	}
	
	private static void printProblemStartedMsg() {
		System.out.println("문제가 시작되었습니다.. 입력값이 있으면 입력하세요\n-----------------------------");
	}
}