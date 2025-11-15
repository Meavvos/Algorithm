import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=0,y=0,p=0,q=0;
		int x2=0,y2=0,p2=0,q2=0;
		char ans=0;
		for(int i=0; i<4; i++) {
			/*직1 */x=sc.nextInt(); y=sc.nextInt();/*뒷꼭*/ p=sc.nextInt(); q=sc.nextInt(); 
			/*직2*/x2=sc.nextInt(); y2=sc.nextInt(); /*뒷꼭*/p2=sc.nextInt(); q2=sc.nextInt();
			//x<=x2 && p<=p2 && q<=q2)|| (x2<=x && p2<=p && q2<=q
			if(p<x2|| p2<x || q<y2|| q2<y ) {
				ans = 'd';
				
			}
			else if((x==p2 && y2==q )||
					( p2==x && y==q2)||
					(p==x2 && q==y2)||
					(p==x2&& y==q2)){
				ans = 'c';
				
			}
			else if(x==p2 || y==q2 ||x2==p || q==y2){
				ans = 'b';
				
			}
			else  { ans='a';}
			
			System.out.println(ans);
		}
	}
}
