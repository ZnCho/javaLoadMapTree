package lang.string.test;

public class TestString6 {

	public static void main(String[] args) {
		String str = "start hello java, hello spring, hello jpa";
		String key = "hello";

		int count = 0;
		int index = str.indexOf(key); //6
		System.out.println("index = " + index);

		while (index >= 0){ //index가 계속 하나씩 늘고, 끝까지 못 찾으면 -1이 됨
			index = str.indexOf(key, index + 1);
			count++;
		}
		System.out.println("count = " + count);
	}
}
