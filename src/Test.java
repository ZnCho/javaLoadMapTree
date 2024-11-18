public class Test {
	public static void main(String[] args) {
		solution("abc1abc1abc");
		int a = solution(7, 1, new boolean[]{false, false, false, true, false, false, false});
		System.out.println(solution1(new int[]{2, 1, 6}));
	}

	public static int[] solution1(int[] num_list) {
		int[] answer = {};
		return answer;
	}

	public int solution(int[] num_list) {
		int answer = 0;
		String odd = "";
		String eve = "";
		for (int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 1){
				odd = odd + num_list[i];
			} else {
				eve = eve + num_list[i];
			}
		}
		answer = Integer.parseInt(odd) + Integer.parseInt(eve);
		return answer;
	}

	public int soulution(int[] num_list) {
		int answer = 0;
		int multiply = 1;
		int plus = 0;
		for(int i : num_list){
			multiply *= i;
			plus += i;
		}
		plus *= plus;
		if(multiply > plus) {
			answer = 0;
		} else {
			answer = 1;
		}
		return answer;
	}

	public int solution(int a, int b, int c) {
		int answer = 0;
		if( a != b && b != c && c != a){
			answer = a + b + c;
		} else if (a == b && b == c && c == a) {
			answer = (a + b + c) * ( a * a + b * b + c * c) * ( a * a * a + b * b * b + c * c * c);
		} else {
			answer = (a + b + c) * (a * a + b * b + c * c);
		}
		return answer;
	}

	public static int solution(int a, int b, boolean[] included) {
		int answer = 0;
		for(int i = 0; i < included.length; i++) {
			if(included[i]) {
				answer += a + (b * i);
			}
		}
		return answer;
	}

	public static void solution(String code) {
		String answer = "";
		int mode = 0; // 0 / 1
		String ret = "";
		String[] codes = code.split("");

		for(int idx = 0; idx < codes.length; idx++){
			if(mode == 0) {
				if(codes[idx].equals("1")) {
					mode = 1;
				} else {
					if(idx % 2 == 0) {
						ret += codes[idx];
					}
				}
			} else {
				if(codes[idx].equals("1")) {
					mode = 0;
				} else {
					if(idx % 2 != 0) {
						ret += codes[idx];
					}
				}
			}
		}
		if(ret.isEmpty()) {
			answer = "EMPTY";
		} else {
			answer = ret;
		}
		System.out.println(answer);
	}
}
