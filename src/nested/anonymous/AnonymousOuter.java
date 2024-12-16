package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

	private int outInstanceVar = 3;

	public void process(int paramVar) {

		int localVar = 1;
		//익명 클래스는 클래스의 본문(body) 정의와 생성을 동시에.
		Printer printer = new Printer() { //특정 부모 클래스(인터페이스)를 상속(구현)하면서 바로 생성하는 것.
			int value = 0;

			@Override
			public void print() {
				System.out.println("value = " + value);
				System.out.println("localVar = " + localVar);
				System.out.println("paramVar = " + paramVar);
				System.out.println("outInstanceVar = " + outInstanceVar);
			}
		};

		printer.print();
		System.out.println("printer.getClass() = " + printer.getClass());
	}

	public static void main(String[] args) {
		AnonymousOuter localOuter = new AnonymousOuter();
		localOuter.process(2);
	}
}
