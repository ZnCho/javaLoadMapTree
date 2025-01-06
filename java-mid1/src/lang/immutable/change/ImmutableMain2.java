package lang.immutable.change;

public class ImmutableMain2 {
	public static void main(String[] args) {
		ImmutableObj obj1 = new ImmutableObj(10);
		obj1.add(20); //반환값을 받지 않고 있는 상태

		System.out.println("obj1 = " + obj1.getValue()); //변경된 값은 다른 객체로 만들어져있어서 반영X
	}
}
