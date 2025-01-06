package excepiton.ex2;

public class NetWorkServiceV2_3 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data); //추가

		try { //하나의 try 안에 정상 흐름을 모두 담는다.
			client.connect();
			client.send(data);
			client.disconnect(); //예외 발생시 무시
		} catch (NetworkClientExceptionV2 e) { //예외 부분은 catch 블럭에서 해결한다.
			System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
		}
	}
}
