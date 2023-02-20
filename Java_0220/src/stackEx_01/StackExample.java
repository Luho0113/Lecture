package stackEx_01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//동전 프로그램
		
		//Stack 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전 하나씩 꺼내기
		//System.out.println(coinBox.pop().getValue());
		while(!coinBox.isEmpty()) {
			Coin coinPop = coinBox.pop();
			System.out.println("꺼내온 동전: " + coinPop.getValue() + "원");
		}
		
		

	}

}
