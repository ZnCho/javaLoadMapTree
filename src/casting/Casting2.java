package casting;

public class Casting2 {
	public static void main(String[] args) {//자동 형변환, 묵시적 형변환
		double doubleValue = 1.5;
		int intValue = 0;

//		intValue = doubleValue; //컴파일 오류 발생
		intValue = (int) doubleValue; //명시적 형변환
		System.out.println(intValue);
		System.out.println(doubleValue);
	}
}
