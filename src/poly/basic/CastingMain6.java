package poly.basic;

/**
 * instanceof
 */
public class CastingMain6 {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);

		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}

	private static void call(Parent parent) {
		parent.parentMethod();
		//Child 인스턴스인 경우 childMethod() 실행
		if (parent instanceof Child child) { //자바16 이상부턴 변수 선언까지 한번에 할 수 있음
			System.out.println("Child 인스턴스 맞음");
			child.childMethod();
		}
	}
}
