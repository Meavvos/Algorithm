import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num[] = new int[10];
        int result[] = new int[10];
        int cnt=0;
        boolean siva;
         for(int i=0; i<10; i++){
             num[i] =sc.nextInt();
             result[i] = num[i]%42;
         }
        for(int i=0; i<result.length;i++){
            siva = false;
            for(int j=i+1; j<result.length;j++)
                {
                    if(result[i]==result[j]){
                        siva = true;
                        break;
                    }
                }
            if(siva==false){
                        cnt++;
                    }
             
        }
          
         

        System.out.println(cnt);
        
        
    }
}