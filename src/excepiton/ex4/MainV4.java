package excepiton.ex4;

import excepiton.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

	public static void main(String[] args) {
		NetWorkServiceV4 netWorkService = new NetWorkServiceV4();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("전송할 문자: ");
			String input = scanner.nextLine();
			if(input.equals("exit")) {
				break;
			}

			try {
				netWorkService.sendMessage(input);
			} catch (Exception e) {
				exceptionHandler(e);
			}
			System.out.println();
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}

	//공통 예외 처리
	private static void exceptionHandler(Exception e) {
		//공통 처리
		System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
		System.out.println("==개발자용 디버깅 메시지==");
		e.printStackTrace(System.out); //스택 트레이스 출력 (오류 문구 출력) > 순서대로 잘 출력됨
//		e.printStackTrace(System.err);
// 출력이 빨갛게 보임 > e.printStackTrace() : 기본도 err로 나옴. 일반적으로 많이 사용. 주로 Slf4j, logback 같은 로그 라이브러리를 이용함.
// 서버에서 로그 확인을 하기 위해서임. e.printStackTrace()는 콘솔에서만 확인 가능. > 공부할 때 자주 찍어서 확인해봐라.

		//필요하면 예외 별로 별도의 추가 처리 가능
		if (e instanceof SendExceptionV4 sendEx) {
			System.out.println("[전송 오류] 전송 데이터: " + sendEx.getMessage());
		}
	}
}
