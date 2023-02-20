package queueEx_01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// Queue ����
		Queue<Message> messageQueue = new LinkedList<>();
		
		//�޼��� �ֱ�
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�̼���"));
		messageQueue.offer(new Message("sendKakaotalk", "������"));
		
		
		//�޼����� �ϳ��� ������ ó��
		while(!messageQueue.isEmpty()) { //������� �ʴٸ� �ݺ�
			Message messageOut = messageQueue.poll();
			// System.out.println(messageOut.to + "���� " + messageOut.command + "�� �����ϴ�.");
			// System.out.println(messageOut.to + "���� " + messageOut.command.substring(4) + "�� �����ϴ�.");
			
			switch(messageOut.command) {
				case "sendMail" : 
					System.out.println(messageOut.to + "�Կ��� ������ �����ϴ�.");
					break;
				case "sendSMS" : 
					System.out.println(messageOut.to + "�Կ��� ���ڸ� �����ϴ�.");
					break;
				case "sendKakaotalk" : 
					System.out.println(messageOut.to + "�Կ��� īī������ �����ϴ�.");
					break;
			}
		}

	}

}
