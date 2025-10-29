import java.util.*;
import java.util.regex.Pattern;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int test_case=1;test_case<=T;test_case++) {
			
			String arr = sc.next();
			int count =0;
			for(int i=1; i<=10; i++) {
				String pattern = arr.substring(0,i);
				String next = arr.substring(i,i+i);
			if(pattern.equals(next)) {
				count=i;
				break;
			}
			}
			
			System.out.println("#"+test_case +" "+ count);
		}
		sc.close();
	}
}
