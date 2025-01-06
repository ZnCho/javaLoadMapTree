package poly.overriding;

public class OverridingMain {

	public static void main(String[] args) {
		//자식 변수가 자식 인스턴스 참조
		Child child = new Child();
		System.out.println("Child -> Child");
		System.out.println("value = " + child.value);
		child.method();

		//부모 변수가 부모 인스턴스 참조
		Parent parent = new Parent();
		System.out.println("Parent -> Parent");
		System.out.println("value = " + parent.value);
		parent.method();

		//부모 변수가 자식 인스턴스를 참조(다형적 참조)
		Parent poly = new Child();
		System.out.println("Parent -> Child");
		System.out.println("value = " + poly.value); //변수는 오버라이딩X
		poly.method(); //메서드 오버라이딩! > 오버라이딩 된 변수는 항상 우선권을 갖는다.
		/// 만약 손자에서도 같은 메서드를 오버라이딩하면 손자의 오버라이딩 메서드가 우선권을 갖는다.
	}
}
