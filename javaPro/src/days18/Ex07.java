package days18;

public class Ex07 {

	public static void main(String[] args) {
		
		// 객체로 부터 Class 객체를 얻어오는 3가지 방법
		// 1) getClass() 메서드
//		Card card1 = new Card("HEART",3);
//		Class cls = card1.getClass();
//		System.out.println(cls.getName());
//		System.out.println(cls.getSimpleName());
		
		// 2) 모든 클래스명.class 클래스변수가 제공된다.
//		Class cls = Card.class;
//		System.out.println(cls); // class days18.Card		
//		 Class cls 얻어와서 객체 생성
//		try {
//			Card card2 = (Card) cls.newInstance();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
				
		// 3) Class클래스의 static메서드 forName()
		String className = "days18.Card";
		try {
			Class cls = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main

}//class
final class Card{
	String kind; // 카드 종류
	int num; // 카드 번호
	Card(){
		this("SPADE",1);
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
	
	
}