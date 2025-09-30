
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
		int T;
		T=sc.nextInt();
		int[] max =new int[6];

			for(int test_case = 1; test_case <= T; test_case++) {
				int sum=0;

			for(int i=0;i<6;i++) { //6명의 키 입력
				int tall = sc.nextInt();
				max[i]=tall;
				sum +=tall;
			}
			
			int seven = max[0];
			for(int i=1; i<6; i++) 
				
				if(max[i]>seven)
					seven = max[i];
					
			int anwser = seven +1;
			while((anwser+sum)%7!=0)
				anwser++;
			System.out.println(anwser);
			}
	}
}