package poly.basic;

public class PolyMain {

	public static void main(String[] args) {
		//부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();

		//자식 변수가 자식 인스턴스 참조
		System.out.println("Child -> Child");
		Child child = new Child();
		child.parentMethod();
		child.childMethod();

		//부모 변수가 자식 인스턴스 참조(다형적 참조) > 자신을 기준으로 모든 자식 타입을 참조할 수 있다. (자식의 자식, 손자도 가능.)
		System.out.println("Parent -> Child");
		Parent poly = new Child(); //변수 선언은 부모 타입, 생성은 자식 타입. > 부모 타입은 자식 타입을 담을 수 있음. > 반대로 자식 타입이 부모 타입을 담을 순 없음
		poly.parentMethod();

//		Child child1 = new Parent(); //자식은 부모를 담을 수 없다. 컴파일 오류 발생.

		//자식의 기능은 호출할 수 없다. 컴파일 오류 발생.
//		poly.childMethod(); //부모 타입이라 자식 타입의 메서드 호출 불가.
	}
}