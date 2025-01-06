package class1.ex;

import java.util.Iterator;

public class ProductOrderMain {
	public static void main(String[] args) {
		// 여러 상품의 주문 정보를 담는 배열 생성
		ProductOrder[] orders = new ProductOrder[3];
		// 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
		ProductOrder dubu = new ProductOrder();
		dubu.productName = "두부";
		dubu.price = 2000;
		dubu.quantity = 2;
		orders[0] = dubu;

		ProductOrder kimchi = new ProductOrder();
		kimchi.productName = "김치";
		kimchi.price = 5000;
		kimchi.quantity = 1;
		orders[1] = kimchi;

		ProductOrder cola = new ProductOrder();
		cola.productName = "콜라";
		cola.price = 1500;
		cola.quantity = 2;
		orders[2] = cola;

		int totalAmount = 0;
		// 상품 주문 정보와 최종 금액 출력
		for(ProductOrder order : orders) {
			System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
			totalAmount += order.price * order.quantity;
		}
		System.out.println("총 결제 금액: " + totalAmount);
	}
}
