package stackEx_02;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// 주차장
		
		//Stack 생성
		Stack<Park> park = new Stack<Park>();
		
		//삽입
		park.push(new Park("K5"));
		park.push(new Park("티코"));
		park.push(new Park("그랜져"));
		park.push(new Park("벤츠"));
		park.push(new Park("소나타"));
		
		//하나씩 꺼내기
		while(!park.isEmpty()) {
			Park parkOut = park.pop();
			System.out.println("나가는 차: " + parkOut.getCar());
		}
		

	}

}
