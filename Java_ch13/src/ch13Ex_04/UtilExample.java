package ch13Ex_04;

public class UtilExample {

	public static void main(String[] args) {
		//ù��° �Ű������� PairŸ�԰� ����Ÿ�Ը� �ް� �ι�° �Ű������� Ű���� ����
		//Ű���� ��ġ�� ��� Pair�� ����� ���� �����ϰ� ��ġ���� ������ null�� �����ϵ��� ��
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿");
		System.out.println(age);

		ChildPair<String, Integer> childPair = new ChildPair<>("ȫ���", 20);
		Integer childAge = Util.getValue(childPair, "ȫ���");
		System.out.println(childAge);

	}

}
