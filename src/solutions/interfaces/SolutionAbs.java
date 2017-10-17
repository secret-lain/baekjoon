package solutions.interfaces;

public abstract class SolutionAbs implements Solution {
	long startTime = 0;
	long endTime = 0;
	
	@Override
	public void solve() {
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
