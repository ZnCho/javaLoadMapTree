package loop;

public class DoWhile2 {
	public static void main(String[] args) {
		int i = 10;

		do { //무조건 한 번 실행
			System.out.println("현재 숫자는: " + i);
			i++;
		} while(i < 3); //한 번 실행 후 조건 확인
	}
}
