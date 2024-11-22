package static1;

public class DataCountMain3 {
	public static void main(String[] args) {
		Data3 data1 = new Data3("A");
		System.out.println("A count = " + Data3.count);

		Data3 data2 = new Data3("B");
		System.out.println("B count = " + Data3.count);

		Data3 data3 = new Data3("C");
		System.out.println("C count = " + Data3.count);

		//추가
		//인스턴스를 통한 접근
		Data3 data4 = new Data3("D");
		System.out.println(data4.count); //권장하지 않음. 코드만 보면 인스턴스 변수에 접근하는 것처럼 오해할 가능성이 있음.

		//클래스를 통한 접근 - 이게 좀 더 명확하다.
		System.out.println(Data3.count);
	}
}
