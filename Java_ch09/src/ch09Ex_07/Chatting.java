package ch09Ex_07;

public class Chatting {
	
	class Chat {
		void start() { }

		void sendMessage(String message) { }
	}

	String nickName = null; //1. 로컬변수 밖으로 빼버리는 방식
	
	void startChat(String chatId) {
		
		// String nickName = null; -> final 특성을 가져서 값을 변경할 수 없음
		// 2. String nickName = chatId; ->만 넣어줘도 됨
		nickName = chatId;
		
		//익명 객체 생성
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}

