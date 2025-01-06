import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		solution2("Progra21Sremm3", 6, 12);
		int[] a = {1, 5, 2};
		int[] b = {1,2,3,4,5,6,7,8,9};
		solution3(3, a, b);
	}

	public static int[] solution3(int n, int[] slicer, int[] num_list){
		int a = n == 1 ? 0 : slicer[0];
		int b = n == 2 ? num_list.length : slicer[1];
		int c = n == 4 ? slicer[2] : 1;

		int size = (b - a) / c;

		int[] answer = new int[size + 1];

		int idx = 0;
		for(int i = a; i < b + 1; i += c){
			answer[idx++] = num_list[i];
		}
//		if (n == 1) {
//			for (int i = 0; i < b; i++){
//				answer[idx++] = num_list[i];
////				list.add(num_list[i]);
//			}
//		}else if(n == 2){
//			for (int i = a; i < num_list.length; i++){
//				answer[idx++] = num_list[i];
////				list.add(num_list[i]);
//			}
//		}else if(n == 3){
//			for (int i = a; i <= b; i++){
//				answer[idx++] = num_list[i];
////				list.add(num_list[i]);
//			}
//		}else{
//			for (int i = a; i < num_list.length; i += c){
//				if (i > b) break;
//				answer[idx++] = num_list[i];
////				list.add(num_list[i]);
//			}
//		}
//		System.out.println(list);
//		answer = list.stream().mapToInt(i->(int)i).toArray();
		for (int i : answer) {
			System.out.println(i);
		}
		return answer;
	}

	public static void solution2(String my_string, int s, int e){
		StringBuffer sb = new StringBuffer(my_string.substring(s, e+1));
		StringBuffer sb2 = new StringBuffer(my_string);
		String str = sb.reverse().toString();
		sb2.replace(s, e+1, str);
		System.out.println(sb2.toString());
	}
	
	public static void solution2(String my_string, String is_suffix){
//		List<String> answer = new ArrayList<>();
		int answer = 0;
		String[] strings = new String[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			strings[i] = my_string.substring(i, my_string.length());
			System.out.println(strings[i]);
			if(strings[i].equals(is_suffix)){
				answer = 1;
				break;
			} else {
				answer = 0;
			}
		}
		System.out.println(answer);
//		return answer;
	}

	public String solution(String my_string, int n) {
		String answer = "";
		answer = my_string.substring(my_string.length()-n, my_string.length());
		return answer;
	}

	public static String solution(String[] my_strings, int[][] parts){
		String answer = "";
		for (int i = 0; i < my_strings.length; i++) {
			int s = parts[i][0];
			int e = parts[i][1];
			answer += my_strings[i].substring(s, e+1);
		}
		return answer;
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
