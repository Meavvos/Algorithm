import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T= sc.nextInt();
        int N[] = new int[T];
        for(int i=0; i<T; i++){
            N[i] =sc.nextInt();
        }
        int max=N[0];
        int min=N[0];
        for(int i=0; i<N.length; i++)
        {   
            if(max<N[i]){max=N[i];}
        }
        for(int i=0; i<N.length; i++)
        {   
            if(min>N[i]){min=N[i];}
        }
        System.out.print(min+" "+max);
    }
}