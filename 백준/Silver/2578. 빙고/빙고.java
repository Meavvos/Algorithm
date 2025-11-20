
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] bingo= new int[5][5];
		int cnt=0; int ans=0;
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				bingo[i][j]=sc.nextInt(); //일단 빙고판 입력 
			}
		}
		
		for(int k=0; k<25; k++) {
			int num=sc.nextInt();
			cnt++;
			
			mark(bingo,num);
			
			if(cntbing(bingo)>=3) {
				System.out.println(cnt);
				return;
			}
			
		}
	}
	public static void mark(int[][] bingo, int num) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(bingo[i][j]==num) {
					bingo[i][j]=-1;
					return;
				}
			}
		}
	}
	public static int cntbing(int[][] bingo) {
		int line=0;
		for(int i=0; i<5; i++) { //가로
			int sum=0;
			for(int j=0; j<5; j++) {
				sum+=bingo[i][j];

			}if(sum==-5) {
				line++;
			}
		}
		for(int i=0; i<5; i++) { //세로
			int sum=0;
			for(int j=0; j<5; j++) {
				sum+=bingo[j][i];
			}
			if(sum==-5) {
				line++;
			}
		}
		
		int d1=0;
		for(int i=0; i<5; i++) { // 대각선
			d1+=bingo[i][i];
		}
		if(d1==-5) {
			line++;
		}
		int d2=0;
		for(int i=0; i<5; i++) { // 대각선2			
			d2+=bingo[i][4-i];
		}
		if(d2==-5) {
			line++;
		}
		return line;
	}
}
