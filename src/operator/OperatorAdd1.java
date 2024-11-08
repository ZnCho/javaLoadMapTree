package operator;

public class OperatorAdd1 {
	public static void main(String[] args) {
		int a = 0;

		a = a + 1;
		System.out.println("a = " + a); //1
		a = a + 1;
		System.out.println("a = " + a); //2

		//증감 연산자 : 피연산자 앞에 두거나 뒤에 둘 수 있으며 위치에 따라 연산이 수행되는 시점이 달라진다.
		++a; //a = a + 1
		System.out.println("a = " + a);
		++a; //a = a + 1
		System.out.println("a = " + a);
		--a; // = a - 1
		System.out.println("a = " + a);
	}
}
