package days03;

/**
 * @author minseok
 * @date 2023. 7. 17. - 오후 3:18:45
 * @subject 대문자 -> 소문자 변환
 *               소문자 -> 대문자 변환
 * @content
 */
public class Ex07 {
	public static void main(String[] args) {
		
		char lowerCase , upperCase;

		lowerCase = 'x';
		System.out.println(lowerCase);
		//Type mismatch: cannot convert from int to char
		upperCase = (char) (lowerCase - 32);
		System.out.printf("%c\n",upperCase);
		lowerCase = (char) (upperCase + 32);
		System.out.printf("%c\n",lowerCase);
		
		// '0' 48
		// '2' 50
		// '4' 52
		//                          52 - 50
		System.out.println( '4' - '2'); // 2
		//upperCase 변수에는 loweCase 의 대문자를 저장해서 출력.
		// 'A' 65 -> 'a' 97
		// 대           소문자 차 = 32
		// 소문자 -32 = 대문자;
		
		
		
	}//main
}//class
