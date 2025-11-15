

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day =sc.nextInt();
		int sum= sc.nextInt();
		int arr[] = new int[day];
		for(int i=0; i<day; i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int plus=0;
	
		for(int i=0; i<sum; i++) {
				plus += arr[i];}
		max=plus;
		for(int j=sum; j<day; j++) {
			plus = plus- arr[j-sum]+arr[j]; //앞 제거 뒤추가 
			if(plus>max) {max=plus;}
		}
					
		
		System.out.println(max);
	}
}
