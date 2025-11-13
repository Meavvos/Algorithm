import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num[] =new int[9];
        for(int i=0; i<9; i++){
            num[i]=sc.nextInt();
        }
        int max = num[0];
        int index;
        int cnt =0;
        for(int i=0; i<9; i++){
           if(max<num[i]){
               max=num[i];
               cnt=i;
           }
        }
        index=cnt+1;
        System.out.println(max);
        System.out.print(index);
        
        
    }
}