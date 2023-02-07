package ch09Ex_07;

public class Chatting {
	
	class Chat {
		void start() { }

		void sendMessage(String message) { }
	}

	String nickName = null; //1. ���ú��� ������ �������� ���
	
	void startChat(String chatId) {
		
		// String nickName = null; -> final Ư���� ������ ���� ������ �� ����
		// 2. String nickName = chatId; ->�� �־��൵ ��
		nickName = chatId;
		
		//�͸� ��ü ����
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		
		chat.start();
	}
}

