package insufficienEx_02;

public class Score {
	
	private int finalScore;
	
	public Score() { }
	
	public int getFinalScore() {
		return finalScore;
	}
	
	
	public int setFinalScore(int finalScore) {
		this.finalScore = finalScore;
		return finalScore;
	}

	//���� �Է�
	public void inputScore (int score) throws ScoreMinException, ScoreMaxException{
		
		
		if (score <= 0) {
			throw new ScoreMinException("0�� ������ ������ �Է��߽��ϴ�.");
		}
		else if (score > 990 ) {
			throw new ScoreMaxException("������ �ʰ��߽��ϴ�.");
		}
		finalScore = finalScore + score;
	}

	
	
}
