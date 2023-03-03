package ch16Ex_07;

public class Example {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}

	//람다식으로 작성해보기
	public static void main(String[] args) {
		// 최대값 얻기
		//메소드의 타입이 Operator 인터페이스임
		//리턴문 하나만 있을 경우 중괄호와 return 키워드 생략가능
		int max = maxOrMin(
			(x, y)-> (x>=y)? x:y //{ return (x<=y)? x:y; }
		);
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin(	
			(x, y) -> (x<=y)? x:y
		);
		System.out.println("최소값: " + min);
		
		
		
		//람다식 사용X
		int max2 = maxOrMin(new Operator() {
			
			@Override
			public int apply(int x, int y) {
				if (x > y) {
					return x;
				} else {
					return y;
				}
			}
		});
	}

}
