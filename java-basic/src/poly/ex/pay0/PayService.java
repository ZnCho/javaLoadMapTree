package poly.ex.pay0;

public class PayService {

	public void processPay(String option, int amount){

		boolean result;
		System.out.println("결제를 시작합니다: " + option + ", amount= " + amount);

		if (option.equals("kakao")) {
			result = new KakaoPay().pay(amount);
		} else if (option.equals("naver")) {
			result = new NaverPay().pay(amount);
		} else {
			System.out.println("결제 수단이 없습니다.");
			result = false;
		}

		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제가 실패했습니다.");
		}
	}
}
