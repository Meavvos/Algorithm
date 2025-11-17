
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int W = sc.nextInt();  // 가로
	     int H = sc.nextInt();  // 세로
	     int N = sc.nextInt();  // 상점 수

	     int[] stores = new int[N];

	        // 둘레 전체 길이
	     int total = 2 * (W + H);

	        // 상점 입력
	     for (int i = 0; i < N; i++) {
	            stores[i] = convertToPerimeter(sc.nextInt(), sc.nextInt(), W, H);
	        }

	        // 경비원 입력
	     int guard = convertToPerimeter(sc.nextInt(), sc.nextInt(), W, H);

	     int sum = 0;
	     for (int s : stores) {
	            int diff = Math.abs(guard - s);
	            sum += Math.min(diff, total - diff);
	        }

	        System.out.println(sum);
	    }

	    // 방향 + 거리 → 둘레상의 일직선 좌표로 변환
	 static int convertToPerimeter(int dir, int dist, int W, int H) {
	        // 1북, 2남, 3서, 4동
	     switch (dir) {
	         case 1: return dist;                   // 북쪽
	         case 4: return W + dist;               // 동쪽
	         case 2: return W + H + (W - dist);     // 남쪽
	         case 3: return W + H + W + (H - dist); // 서쪽
	        }
	     return 0;
	    }
	
}
