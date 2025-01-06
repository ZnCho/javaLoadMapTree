package excepiton.ex1;

public class NetWorkServiceV1_2 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV1 client = new NetworkClientV1(address);
		client.initError(data); //추가


		String connectResult = client.connect();
		//결과가 성공이 아니다 -> 오류 => 오류인가? 판단하는 메서드로 복잡한 걸 축약
		if (isError(connectResult)) {
			System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
			return;
		}

		String sendResult = client.send(data);
		if (isError(sendResult)) {
			System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
			return;
		}

		client.disconnect();
	}

	private static boolean isError(String connectResult) {
		return !connectResult.equals("success");
	}
}
