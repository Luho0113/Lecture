package queueEx_01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// Queue 생성
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "이순신"));
		messageQueue.offer(new Message("sendKakaotalk", "유관순"));
		
		
		//메세지를 하나씩 꺼내어 처리
		while(!messageQueue.isEmpty()) { //비어있지 않다면 반복
			Message messageOut = messageQueue.poll();
			// System.out.println(messageOut.to + "에게 " + messageOut.command + "를 보냅니다.");
			// System.out.println(messageOut.to + "에게 " + messageOut.command.substring(4) + "를 보냅니다.");
			
			switch(messageOut.command) {
				case "sendMail" : 
					System.out.println(messageOut.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS" : 
					System.out.println(messageOut.to + "님에게 문자를 보냅니다.");
					break;
				case "sendKakaotalk" : 
					System.out.println(messageOut.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}

	}

}
