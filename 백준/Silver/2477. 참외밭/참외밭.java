

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int CW=sc.nextInt();
		int d[]= new int[6];
		int w[] = new int[6];
		for(int i=0; i<6;i++) {
			d[i]=sc.nextInt();
			w[i]=sc.nextInt();
		}
		int MaxH=0, MaxW=0, maxR=0, maxL=0;
		
		for(int i=0; i<6; i++) {
			if(d[i]==1 ||d[i]==2) {
				if(w[i]>MaxW) {
					MaxW=w[i];
					maxR=i;
				}
			}else { //d[i] 가 3,4 겠지
				if(w[i]>MaxH) {
					MaxH=w[i];
					maxL=i;
				}
			}
		}
		int smallm=Math.abs(w[(maxR+5)%6]-w[(maxR+1)%6]);
		int smallh=Math.abs(w[(maxL+5)%6]-w[(maxL+1)%6]);
		int area =(MaxH*MaxW - smallh*smallm)*CW;
		System.out.println(area);
	}
}
