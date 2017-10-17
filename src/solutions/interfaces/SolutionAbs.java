package solutions.interfaces;

public abstract class SolutionAbs implements Solution {
	long startTime = 0;
	long endTime = 0;
	
	@Override
	public void solve() {
		//TemplateMethod Pattern.
		//AOP처럼 실제 솔루션 클래스는 시간을 재고있는지 모르게 끼워넣음.
		startSolvingProblem();
		setSolvingCode();
		endSolvingProblem();
	}
	
	protected void startSolvingProblem() { startTime = System.currentTimeMillis(); }
	
	private void endSolvingProblem() {
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000 + "sec elapsed.");
	}
	
	public abstract void setSolvingCode();
}
