package loop;

public class Break1 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while(true){//(ture) 무한반복
			sum = sum + i;
			if(sum > 1000000){
				System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
				break; //{코드 블럭} 빠져나옴
			}
			i++;
		}
	}
}
