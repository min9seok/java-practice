package days13;

/**
 * @author kenik
 * @date 2023. 7. 31. - 오전 11:20:10
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. Tv 클래스 선언 - Tv.java
		// 2. Tv 객체 생성
		Tv tv1 = null;
		tv1 = new Tv();
		// 클래스 사용할때 NullPointException 에러 제일 많이 발생.
		// java.lang.NullPointerException
		
		//         멤버를 가리킬 때 
		// 객체명.필드명
		// 객체명.메서드명();
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF" ));
		tv1.channelUp();
		System.out.println("현재 채널 : " + tv1.channel);
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		System.out.println(" end ");

	} // main

} // class
