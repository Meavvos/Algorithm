
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
         int N = sc.nextInt();
		int[] apt=new int[N];
		for(int i=0; i<N; i++)
        {	apt[i]=sc.nextInt();}
        int veiw=0;
		for(int i=2; i<N-2; i++)
		{	
				int L1=apt[i-1];
				int L2=apt[i-2];
				int R1=apt[i+1];
				int R2=apt[i+2];
				int MAX=Math.max(Math.max(L1,L2),Math.max(R1,R2));
				
				if(apt[i]>MAX) {
					veiw+=apt[i]-MAX;
				}
        }
				
		System.out.println("#"+test_case+" "+veiw);		
        
		}
        	
	}
}
