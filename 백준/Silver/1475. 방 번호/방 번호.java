import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Rn = in.next();
		in.close();
		
		int[] count = new int[10]; // 0~9까지 숫자의 개수를 넣는 배열
		for(int i=0;i < Rn.length();i++) {
			char ch = Rn.charAt(i); // 문자열의 첫번째부터 꺼내기 
			int num = ch -'0'; // 뽑아낸 문자열을 숫자로 바꿈
			count[num]++; // 그담에 카운트 (개수세는배열)에 넣어버림 1이 여러개 나오면 그 개수만큼 ++
		}
		int SN = count[6] + count[9];
		int SNea = (SN+1)/2; // 왜냐? 홀수개수여도 한세트 더 필요함
        count[6]=SNea;
		// 그럼이제 최솟값을 구해야댐 말이 최솟값이지 숫자개수의 최대값을 구하는 것
		
		int answer =0;
		for( int i=0; i<9; i++) { // 세트개수 6에 박았은까 9 안봐도 됨
			if(count[i]>answer) {
				answer = count[i];
			}
		}
		
		System.out.println(answer);
	}
}
