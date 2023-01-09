package coll;

import java.util.Stack;

//p.768
//동전 클래스
/* LIFO (last in first out) //스택 - 실행취소
 * FIFO (first in first out) // 큐
 * 
 */

//동전 클래스 만들기
class Coin{
	private int value;
	
	//생성자
	public Coin(int value) {
		this.value = value;
		
	}
	
	//getter
	public int getValue() {
		return value;
	}
}

public class Stack02 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100)); //stack의 메모리에 저장됨
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10)); // 마지막에 들어감
		
		//어디서부터 시작하는지 모를때는 while을 사용
		while(!coinBox.isEmpty()) { //coinbox가 비어있지 않다면 들어오라
			Coin coin = coinBox.pop(); //요소에서 가져옴 = 코인박스에서 가져올 것.
			System.out.println("꺼내온 동전 :" + coin.getValue()); 
								//마지막에 들어간 것 부터 출력
		}
	}
}
