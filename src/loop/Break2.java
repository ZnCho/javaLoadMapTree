package loop;

public class Break2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		//어떤 값이 증감하는지, 조건을 알기 어려움
		for(; ;){//조건식 없으면 무한반복
			sum = sum + i;
			if(sum > 10){
				System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
				break; //{코드 블럭} 빠져나옴
			}
			i++;
		}
	}
}
