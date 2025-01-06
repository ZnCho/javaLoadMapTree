package nested.test;

public class AnoymousMain {

	public static void main(String[] args) {
		Hello hello = new Hello() {

			@Override
			public void hello() {
				System.out.println("Hello.hello");
			}
		};
		hello.hello();
	}
}
