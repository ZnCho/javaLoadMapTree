package loop;

public class While2_3 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int endNum = 10;

		while (i <= endNum) { //반복 횟수 정하기 > (조건)에 맞을 때까지 {코드 블럭}을 실행함
			sum = sum + i;
			System.out.println("i=" + i + " sum=" + sum);
			i++;
		}
	}
}
