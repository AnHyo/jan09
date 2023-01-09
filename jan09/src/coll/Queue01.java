package coll;

import java.util.LinkedList;
import java.util.Queue;

//770p
//카톡 보내기

class Message{
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
}
public class Queue01 {
	public static void main(String[] args) {
		Queue<Message> messagesQueue = new LinkedList<Message>(); //인터페이스는 객체 생성 안됨
		
		messagesQueue.offer(new Message("sendMail","홍길동")); //(보내는사람,받는사람)
		messagesQueue.offer(new Message("sendSMS","황현진"));
		messagesQueue.offer(new Message("sendKakaotalk","양정인"));
		
		//반복문
		while(!messagesQueue.isEmpty()) { //messagesQueue가 안비어있으면
			Message message = messagesQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 문자 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 문자 보냅니다.");
				break;

			default:
				break;
			}
		}
		
	}
	
}
