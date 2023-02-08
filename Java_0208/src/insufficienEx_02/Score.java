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

	//점수 입력
	public void inputScore (int score) throws ScoreMinException, ScoreMaxException{
		
		
		if (score <= 0) {
			throw new ScoreMinException("0점 이하의 점수를 입력했습니다.");
		}
		else if (score > 990 ) {
			throw new ScoreMaxException("만점을 초과했습니다.");
		}
		finalScore = finalScore + score;
	}

	
	
}
