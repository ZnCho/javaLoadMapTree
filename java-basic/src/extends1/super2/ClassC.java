package extends1.super2;

public class ClassC extends ClassB {
	public ClassC(){
//		super(); //기본 생성자가 없을 경우 아래와 같이 직접 입력해줘야함.
		//아래 생성자는 기본 생성자가 아니기 때문에 생략 불가능함.
		super(10, 20); //ClassB의 생성자가 2개 있는데, 생성자는 1개만 호출 할 수 있다.
		System.out.println("ClassC 생성자");
	}
}
