import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); // 스위치 개수 1  (100이하 
		int[] state;
		state = new int[S+1];
		for(int i =1; i<=S; i++) {
			state[i]=sc.nextInt(); //스위치 상태 2
		}
		int student=sc.nextInt();
		int sex=0,num;
		for(int i=0;i<student; i++) {
			sex=sc.nextInt();
			num=sc.nextInt();
			
			if(sex==1) {
				for(int j=num; j<=S;j=j+num) {
					state[j]=1-state[j];
				}//남학생 끝 ; 
			}
			else {
				state[num]=1-state[num];
				int l=1;
				while(num-l>=1 && num+l<=S) {
					if(state[num-l]==state[num+l]) {
						state[num-l]=1-state[num-l];
						state[num+l]=1-state[num+l];
						l++;
					}else break;
				}
			}
		}
		for(int i=1; i<=S;i++) {
			System.out.print(state[i]+ " ");
			if(i%20==0) {
				System.out.println();
			}
		}
		
		
	}
}
