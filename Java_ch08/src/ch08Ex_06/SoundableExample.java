package ch08Ex_06;

public class SoundableExample {
	//printSound()�� ȣ���� �� Cat�� Dog ��ü�� �ְ� �����ϸ� ���� "�߿�"�� "�۸�"�� ��µǵ��� Ŭ������ �ۼ�
	
	public static void printSound ( Soundable soundable ) {
		//�Ű����� Ÿ�� = �������̽�
	
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
