import java.util.Scanner;

public class Main {
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1}; 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N,M,d,r,c,robot;
		N=sc.nextInt();
		M=sc.nextInt();
		r=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		int cnt=0;
		int[][] room = new int[N][M];
		for(int i =0; i<room.length; i++) {
			for(int j=0; j<room[i].length; j++) {
				room[i][j]=sc.nextInt();
			}
		}
		while(true) {
			//1. 현재칸 청소
			if(room[r][c]==0) {
				room[r][c]=2;
				cnt++;
			}
			boolean clean =false;
			//2. 왼쪽부터 4방향 탐색 
			for(int i=0; i<4; i++) {
				d=(d+3)%4;//반시계 방향 회전
				int nx= r+dx[d];
				int ny= c+dy[d];
			if(nx>=0&&ny>=0&&nx<N&&ny<M&&room[nx][ny]==0) {
				r=nx;
				c=ny;
				clean =true;
				break;
			}
		}//4방향 모두 깨끗 =1 
			if(!clean) {
				//후진
				int back =(d+2)%4;
				int br=r+dx[back];
				int bc= c+dy[back];
				if(br<0||br>=N||bc<0||bc>=M||room[br][bc]==1) {
					break;
				}
				//후진되면 후진 (방향 유지
				r=br;
				c=bc;
			}
	}
		System.out.println(cnt);
		
	
	}
}
