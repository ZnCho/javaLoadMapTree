package extends1.super2;

public class Super2Main {
	public static void main(String[] args) {
		/** 생성자의 실행 순서가 결과적으로 최상위 부모부터 실행되어 하나씩 아래로 내려온다.
		 *  따라서 초기화는 최상위 부모부터 이루어진다.
		 *  = 자식 생성자의 첫줄에서 부모의 생성자를 호출해야 하기 때문이다.
		 *
		 *  상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다.
		 */
//		ClassC classC = new ClassC();

		ClassB classB = new ClassB(100);
	}
}
