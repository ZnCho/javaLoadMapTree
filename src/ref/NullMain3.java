package ref;

public class NullMain3 {
	public static void main(String[] args) {
		BigData bigData = new BigData();
		bigData.data = new Data(); //참조할 곳을 줌. 이 코드가 없으면 10열에서 NullPointerException 이 발생함
		System.out.println("bigData.count = " + bigData.count);
		System.out.println("bigData.data = " + bigData.data);

		System.out.println("bigData.data.value = " + bigData.data.value);
	}
}
