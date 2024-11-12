package loop;

public class Continue1 {
	public static void main(String[] args) {
		int i = 1;

		while (i <= 5) {
			if (i == 3){
				i++;
				continue; //이 아래 코드 진행X
			}
			System.out.println(i);
			i++;
		}
	}
}
