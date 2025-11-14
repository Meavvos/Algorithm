import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        int[][] Bp = new int[101][101];
        int x,y;
        for(int l=0; l<input; l++){
            x=sc.nextInt();
            y=sc.nextInt();
            for(int i=x; i<x+10; i++){
                for(int j=y; j<y+10; j++){
                    Bp[i][j]=1;
                }
            }
        }
        int sum=0;
          for(int i=0; i<101; i++){
                for(int j=0; j<101; j++){
                    if(Bp[i][j]==1){
                        sum++;
                    }
                }
            }
        System.out.print(sum);
    }
}