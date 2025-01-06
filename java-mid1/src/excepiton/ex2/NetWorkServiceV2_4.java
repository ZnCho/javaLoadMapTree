package excepiton.ex2;

public class NetWorkServiceV2_4 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data); //추가

		try {
			client.connect();
			client.send(data); //throw new RuntimeException("ex"); > uncheck exception이라서 밖으로 던짐 > disconnect 호출 안됨
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
		}
		//NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
		client.disconnect();
	}
}
