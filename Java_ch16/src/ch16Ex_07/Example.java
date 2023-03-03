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

	//���ٽ����� �ۼ��غ���
	public static void main(String[] args) {
		// �ִ밪 ���
		//�޼ҵ��� Ÿ���� Operator �������̽���
		//���Ϲ� �ϳ��� ���� ��� �߰�ȣ�� return Ű���� ��������
		int max = maxOrMin(
			(x, y)-> (x>=y)? x:y //{ return (x<=y)? x:y; }
		);
		System.out.println("�ִ밪: " + max);

		// �ּҰ� ���
		int min = maxOrMin(	
			(x, y) -> (x<=y)? x:y
		);
		System.out.println("�ּҰ�: " + min);
		
		
		
		//���ٽ� ���X
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
