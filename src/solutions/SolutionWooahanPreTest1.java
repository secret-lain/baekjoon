package solutions;
import java.util.Scanner;

import solutions.interfaces.Solution;

/**
 * 
 * 아래의 조건을 만족하는 해는 윤년(leap year)이라고 합니다.
 * 
 * 서력기원으로 연수가 4로 나누어 떨어지는 해는 윤년으로 한다.(2004년, 2008년, 2012년, 2016년, 2020년…) 이 중에서
 * 100으로 나누어 떨어지는 해는 평년으로 한다.(1900년, 2100년, 2200년, 2300년…) 그중에 400으로 나누어 떨어지는 해는
 * 윤년으로 둔다.(1600년, 2000년, 2400년 …) 연도를 입력받고 윤년인지 아닌지를 결정하는 프로그램을 작성하십시오.
 * 
 * 
 * 
 * 입력
 * 
 * 년도(0년 이상)
 * 
 * 출력
 * 
 * 윤년일 경우 Leap Year
 * 
 * 평년일 경우 Not Leap Year
 * 
 * 보기 입력 1 2000 출력 1 Leap Year
 * 
 * 보기 입력 2 2100 출력 2 Not Leap Year
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
