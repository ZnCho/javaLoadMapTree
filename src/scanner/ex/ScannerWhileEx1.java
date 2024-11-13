package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
			String name = input.nextLine();

			if(name.equals("종료")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("나이를 입력하세요: ");
			int age = input.nextInt(); //10\n 입력하면 10만 가져가고 \n 남아있음
			input.nextLine(); //이 부분이 없으면 남은 \n이 다음 input.nextLine()에 들어감

			System.out.println("입력한 이름: " + name + ", 나이: " + age);
		}


	}
}
