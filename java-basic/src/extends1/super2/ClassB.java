package extends1.super2;

public class ClassB extends ClassA {

	public ClassB(int a) {
//		super(); //기본 생성자 생략 가능
		this(a, 0); //예외 : 생성자 첫줄에 this()를 쓸 수 있다. 다만 super()는 자식 생성자 안에서 언젠가 한번은 호출되야한다.
		System.out.println("ClassB 생성자 a= " + a);
	}

	public ClassB(int a, int b){
		super(); //기본 생성자 생략 가능
		System.out.println("ClassB 생성자 a= " + a + " b= " + b);
	}
}
