package excepiton.ex2;

public class NetWorkServiceV2_5 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data); //추가

		// try - finally만 쓸 수도 있다. > 오류를 catch하진 않지만 finally 코드는 무조건 호출하겠다.
		try {
			client.connect();
			client.send(data); //throw new RuntimeException("ex"); > uncheck exception이라서 밖으로 던짐 > disconnect 호출 안됨
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
		} finally {
			//반드시 호출해야 하는 마무리 흐름 (예외를 catch하지 않고 던져도 finally 코드 블럭이 끝나고 나서 이후에 예외가 밖으로 던짐)
			client.disconnect();
		}
	}
}
