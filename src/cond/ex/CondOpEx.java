package cond.ex;

public class CondOpEx {
	/**
	 * 여러분은두개의정수변수 `a` 와 `b` 를가지고있다. `a` 의값은 `10` 이고, `b` 의값은 `20` 이다.삼항연산자를사용하여
	 * 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.
	 * 출력 예시 : 더 큰 숫자는 20입니다.
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("더 큰 숫자는 " + max + "입니다.");
	}
}
