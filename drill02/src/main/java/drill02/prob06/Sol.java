package drill02.prob06;

/**
 * 
 * 문제 6: 변수 타입 오류 찾기
 * 
 * 문제: 오류 발생 줄에 그 이유를 주석으로 달고 바르게 고쳐 컴파일 및 실행하기
 * 
 */
public class Sol {

	public static void main(String[] args) {
		// 정수형 리터럴 대입
		// int count = "three";
		int count = 3;
		
		// 불린형 리터털 대입
		// boolean isOn = 1;
		boolean isOn = false;

		// 문자형 리터럴 대입	
		// char c = "A";
		char c = 'A';
		
		// 실수형 리터럴은 기본이 double, float형으로 대입됨을 명시
		// float f = 3.14;
		float f = 3.14f;
		
		String name = "Alice";
		
		System.out.println(count);
		System.out.println(isOn);
		System.out.println(c);
		System.out.println(f);
		System.out.println(name);		
	}

}
