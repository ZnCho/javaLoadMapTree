package method.ex;

import java.util.Scanner;

public class MethodEx4 {
	public static void main(String[] args) {
		int balance = 0;
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("---------------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택: ");

			int choice = input.nextInt();
			int amount;
			switch(choice){
				case 1:
					System.out.print("입금액을 입력하세요: ");
					amount = input.nextInt();
					balance = deposit(balance, amount);
					break;
				case 2:
					System.out.print("출금액을 입력하세요: ");
					amount = input.nextInt();
					balance = withdraw(balance, amount);
					break;
				case 3:
					System.out.println("현재 잔액: " + balance + "원");
					break; //switch 끝O - while 끝X
				case 4:
					System.out.println("시스템을 종료합니다.");
					return; //프로그램 종료
				default:
					System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
			}
		}
	}

	public static int deposit (int balance, int depositAmount) {
		balance += depositAmount;
		System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
		return balance;
	}

	public static int withdraw (int balance, int withdrawAmount) {
		if(balance >= withdrawAmount) {
			balance -= withdrawAmount;
			System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
		} else if (balance < withdrawAmount) {
			System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
		}
		return balance;
	}
}
