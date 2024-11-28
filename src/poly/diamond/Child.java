package poly.diamond;

public class Child implements InterfaceA, InterfaceB{ //interface 다중구현
	@Override
	public void methodA() {
		System.out.println("Child.methodA");
	}

	@Override
	public void methodB() {
		System.out.println("Child.methodB");
	}

	@Override
	public void methodCommon() { //양쪽 interface에 있지만 구현은 한번만 하면 된다.
		System.out.println("Child.methodCommon");
	}
}
