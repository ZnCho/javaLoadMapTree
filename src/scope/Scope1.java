package scope;

public class Scope1 {
	public static void main(String[] args) {
		int m = 10; //m 생존 시작. 스코프 넓음
		if (true) {
			int x = 20; //x 생존 시작. 스코프 짧음
			System.out.println("if m = " + m);
			System.out.println("if x = " + x);
		} //x 생존 종료
//		System.out.println("main x = " + x); //오류, 변수 x 접근 불가
		System.out.println("main m = " + m);
	} //m 생존 종료
}
