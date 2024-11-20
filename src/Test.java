import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		boolean a = solution(false, false, false, false);
		System.out.println(a);
	}

	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = true;
		if ((x1 || x2) && (x3 || x4)) {
			answer = true;
		} else {
			answer = false;
			return answer;
		}
		return answer;
	}
}
