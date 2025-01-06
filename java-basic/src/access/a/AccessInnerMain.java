package access.a;

public class AccessInnerMain {
	public static void main(String[] args) {
		AccessData data = new AccessData();
		//public 호출 가능 - 모든 접근 허용
		data.publicField = 1;
		data.publicMethod();

		//같은 패키지 default 호출 가능
		data.defaultField = 2;
		data.defaultMethod();

		//private 호출 불가 - 내부에서만 접근 가능
//		data.privateField = 3;
//		data.privateMethod();

		data.innerAccess(); //외부에서 호출 > 메서드가 있는 AccessData 내부의 모든 필드와 메서드 접근 가능
	}
}
