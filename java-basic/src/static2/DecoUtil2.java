package static2;

public class DecoUtil2 {
	/**
	 * 클래스 메서드 (정적 메서드 / 클래스 메서드)
	 * - 메서드 앞에 static을 붙일 수 있다. 인스턴스 생성 없이 마치 클래스에 있는 메서드를 바로 호출하는 것처럼 느껴져서 클래스 메서드라고도 한다.
	 * 인스턴스 메서드
	 * - static을 붙이지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다. 이것을 인스턴스 메서드라고 함.
	 */
	public static String deco(String str){
		return "*" + str + "*";
	}
}
