package enumeration.ex2;

public class ClassRefMAin {

	public static void main(String[] args) {
		//타입은 같음
		System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
		System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
		System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

		//인스턴스는 달라서 참조값이 다름
		System.out.println("ref BASIC = " + ClassGrade.BASIC);
		System.out.println("ref GOLD = " + ClassGrade.GOLD);
		System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
	}
}
