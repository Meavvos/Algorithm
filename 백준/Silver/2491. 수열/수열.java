import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nmline=new int[N];
		
		for(int i=0; i<N;i++) {
			nmline[i]=sc.nextInt();
		}
		int max1=1; //증가할때 최소 길이 1 
		int max2=1; //감소할때 "
		int ans=1;
		for(int i=0; i+1<N; i++) {
			if(nmline[i]>=nmline[i+1]) {
				max1++;
			}else max1=1;
			
			if(nmline[i]<=nmline[i+1]) {
				max2++;
			}else max2=1;
			
			ans =Math.max(ans,Math.max(max1, max2));
		}
		
		System.out.println(ans);
	}
}
