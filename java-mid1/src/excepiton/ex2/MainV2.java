package excepiton.ex2;

import java.util.Scanner;

public class MainV2 {

	public static void main(String[] args) throws NetworkClientExceptionV2 {
//		NetWorkServiceV2_1 netWorkService = new NetWorkServiceV2_1();
//		NetWorkServiceV2_2 netWorkService = new NetWorkServiceV2_2();
//		NetWorkServiceV2_3 netWorkService = new NetWorkServiceV2_3();
//		NetWorkServiceV2_4 netWorkService = new NetWorkServiceV2_4();
		NetWorkServiceV2_5 netWorkService = new NetWorkServiceV2_5();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("전송할 문자: ");
			String input = scanner.nextLine();
			if(input.equals("exit")) {
				break;
			}
			netWorkService.sendMessage(input);
			System.out.println();
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}
}
