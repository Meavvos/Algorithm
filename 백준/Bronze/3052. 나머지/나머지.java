import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num[] = new int[10];
        int result[] = new int[10];
        int cnt=0;
      
         for(int i=0; i<10; i++){
             num[i] =sc.nextInt();
             result[i] = num[i]%42;
         }
        for(int i=0; i<result.length;i++){
       
            for(int j=i+1; j<result.length;j++)
                {
                    if(result[i]==result[j]){
                        result[i]=999;
                        break;
                    }
                }
            if(result[i]!=999){
                        cnt++;
                    }
             
        }
          
         

        System.out.println(cnt);
        
        
    }
}