package static1;

public class Data3 {
	/** 멤버변수(필드)의 종류
	 *  인스턴스 변수 : static이 붙지 않은 변수. (예:name)
	 *  - 인스턴스를 만들 때마다 새로 만들어진다.
	 *  - 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 그래서 인스턴스 변수라 부름
	 *  클래스 변수 : static이 붙은 변수. (예:count)
	 *  - 클래스 변수, 정적 변수, static 변수 등으로 부른다. 세 용어를 모두 사용한다.
	 *  - 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 그래서 클래스 변수라 부름
	 *  - 메서드 영역에 딱 1개만 만들어진다. 일반적으론 자바 실행할 때 클래스 파일을 읽으면서 메모리를 할당해서 만들어진다.
	 *  - 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
	 */

	/**
	 * 변수와 생명주기 - 지역 < 인스턴스 < 클래스 순
	 * 지역 변수(스택 영역 생존) :스택 영역에 있는 스택 프레임 안에 보관된다. 메서드가 종료되면 스택 프레임도 제거가 되면서 지역 변수도 같이 제거된다. 생존 주기가 제일 짧음.
	 * 인스턴스 변수(인스턴스 영역 생존) : 인스턴스에 있는 멤버 변수. 힙 영역을 사용한다. GC(가비지 컬렉션)가 발생하기 전까지 생존하기 때문에 보통 지역 변수보다 생존 주기가 길다.
	 * 클래스 변수(메서드 영역 생존) : 메서드 영역의 static 영역에 보관되는 변수. 메서드 영역은 프로그램 전체에서 사용하는 공용 공간이다. 클래스 변수는 해당 클래스가 JVM에 로딩되는 순간
	 * 							생성되고, 종료될 때까지 생명주기가 이어진다. 따라서 가장 긴 생명주기를 가진다. -> 다른 변수에 비해 생성/제거가 적음. 정적이라서 static.
	 */
	public String name; //멤버 변수 : Data3이란 클래스에 속한 멤버 변수(필드)
	public static int count; //static

	public Data3(String name) {
		this.name = name;
		count++;
	}
}
