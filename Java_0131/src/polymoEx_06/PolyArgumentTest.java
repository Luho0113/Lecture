package polymoEx_06;

public class PolyArgumentTest {

	public static void main(String[] args) {
		// ��ü ����
		Buyer b = new Buyer();
		b.buy(new Tv()); //Tv��� ��ü�� �ּҸ� buy �޼ҵ�� ������ ��
		//1. new Tv�� �ּҰ� Product p�� ���޵� -> TvŬ������ �����ڸ� ���� Product Ŭ������ ����!
		//2. ���������� �ּҸ� ��Ƽ� ������ �������̵��� toString�� �ڵ����� ����Ǹ鼭 p.toString���� �����ϵ�
		//syso(p); --> syso(p.toString);
		
		b.buy(new Computer());
		b.buy(new Audio());
		
		//��ǰ ǰ���� �÷����� : �ڵ��� 150����, �����е� 170����
		b.buy(new Phone());
		b.buy(new IPad());
		b.summary();

	}

}
