package excepiton.ex1;

public class NetWorkServiceV1_3 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV1 client = new NetworkClientV1(address);
		client.initError(data); //추가

		//가독성이 떨어짐 (정상 흐름과 예외 흐름이 섞여있음)
		String connectResult = client.connect(); //정상 흐름
		if (isError(connectResult)) { //예외 흐름
			System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
		} else {
			String sendResult = client.send(data); //정상 흐름
			if (isError(sendResult)) { //예외 흐름
				System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
			}
		}

		client.disconnect();
	}

	private static boolean isError(String connectResult) {
		return !connectResult.equals("success");
	}
}
