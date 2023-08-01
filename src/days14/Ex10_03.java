package days14;

/**
 * @author user
 * 초기화 블럭
 * 인스턴스 
 * 클래스
 */
public class Ex10_03 {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		System.out.println(m1.name);
		System.out.println(m1.count);
		Member m2 = new Member();
		
		//초기화 순서
//		1) 명시적 초기화
//		2) 클래스 초기화 ( 객체 생성될 때 1번 초기화)
//		3) 인스턴스 초기화 (객체 생성될 때 마다 초기화)
//			ㄴ 생성자 중복 코딩을 초기화 블럭으로 
//		4) 생성자 초기화  (객체 생성될 때 마다 초기화)
		
	}//main

}//class
 class Member {
	// 필드
	// 1. 인스턴스 변수
	String name="ㅁ"; //명시
	int age=20; //명시
	int count;  //명시 X
	int serialNo; //명시 X
	// 2. 클래스 변수
	static double rate = 0.05; //명시
	
	// 프로그램 시작시 한번 호출
	static {
		// static 변수가 있다면 초기화하는 데 사용
		rate = 0.08;
		System.out.println("> static 초기화 블럭 호출됨..");
	}

//인스턴스 초기화 블럭 
{
	count++;
	serialNo = count;
	System.out.println("> 인스턴스 초기화 블럭 호출됨. ");
}
public Member() {
//	count++;
//	serialNo = count;
	
	name = "무명";
	System.out.println("> Member 디폴트 생성자 호출됨. ");
}
public Member(String name) {
//	count++;
//	serialNo = count;
	
	this.name = name;
	System.out.println("> Member 1 생성자 호출됨. ");
}
 }

