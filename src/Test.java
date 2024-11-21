import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		int[] t = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
//		int[][] tt = {{2,3}, {0,7}, {5,9}, {6,10}};
		String[] str = {"0123456789","9876543210","9999999999999"};
		solution(str, 50000, 5, 5);
//		System.out.println(solution("cvsgiorszzzmrpaqpe", t));
//		System.out.println(solution("rermgorpsam", tt));
	}

	public static int[] solution(String[] intStrs, int k, int s, int l){
		List<Integer> test = new ArrayList<>();
		int[] answer = new int[intStrs.length];
		for (String intStr : intStrs) {
			String str = intStr.substring(s, s+l);
			int num = Integer.parseInt(str);
			if(num > k){
				test.add(num);
			}
		}
		return test.stream().mapToInt(i->i).toArray();
	}

	public static String solution(String my_string, int[][] queries) {
		String answer = "";
		for(int i = 0; i < queries.length; i++){
			int s = queries[i][0];
			int e = queries[i][1];
			String substring = my_string.substring(s, e + 1);
			StringBuffer sb = new StringBuffer(my_string);
			StringBuffer sb2 = new StringBuffer(substring);
			substring = sb2.reverse().toString();
			my_string = sb.replace(s, e + 1, substring).toString();
		}
		answer = my_string;
		return answer;
	}

	public static int solution(String number) {
		int answer = 0;
		int sum = 0;
		for(int i = 0; i < number.length(); i++) {
			int a = Integer.parseInt(String.valueOf(number.charAt(i)));
			sum += a;
		}
		answer = sum % 9;
		return answer;
	}

	public static String solution(String my_string, int[] index_list) {
		String answer = "";
		for (int i = 0; i <index_list.length; i++) {
			answer += my_string.charAt(index_list[i]);
		}
		return answer;
	}

	public static int solution(int a, int b, int c, int d) {
		int answer = 0;
		int p = 0, q = 0, r = 0;
		int[] numbers = new int[7];
		numbers[a] += 1;
		numbers[b] += 1;
		numbers[c] += 1;
		numbers[d] += 1;

		int maxNum = Arrays.stream(numbers).max().getAsInt(); //몇 글자 겹치는지 찾기
		switch(maxNum){
			case 4:
				answer = 1111 * a;
				break;
			case 3:
				for(int i = 0; i < numbers.length; i++){
					if(numbers[i] == 3){
						p = i;
					} else if(numbers[i] == 1){
						q = i;
					}
				}
				answer = (10 * p + q) * (10 * p + q);
				break;
			case 2:
				boolean constains = Arrays.stream(numbers).anyMatch(i -> i == 1); //2글자 같고 남은 2글자 다를 때
				if(constains){
					for (int idx = 0; idx < numbers.length; idx++) {
						if (numbers[idx] == 1) {
							if (q == 0){
								q = idx;
							} else {
								r = idx;
							}
						}
					}
					answer = q * r;
				} else {
					for (int idx = 0; idx < numbers.length; idx++) {
						if (numbers[idx] == 2) {
							if (p == 0) {
								p = idx;
							} else {
								q = idx;
							}
						}
					}
					answer = (p + q) * (Math.abs(p - q));
				}
				break;
			case 1:
				for(int idx = 0; idx < numbers.length; idx++){
					if (numbers[idx] > 0) {
						answer = idx;
						break;
					}
				}
		}
		return answer;
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
