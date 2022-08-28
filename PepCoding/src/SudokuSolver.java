import java.util.*;
public class SudokuSolver {
	   public static int board[][]=new int[9][9];
	   public static void solve(int r,int c) {
		   if(r==9)
			   return;
		   if(c==9) {
			   r=r+1;
			   c=0;
		   }
		   if(board[r][c]==0) {
			   for(int x=1;x<=9;x++) {
				   if(isSafe(x,r,c)) {
					   board[r][c]=x;  
					   solve(r,c+1);
					   board[r][c]=0;
				   }			   
			   }
		   }
		   else {
			   solve(r,c+1);
		   }
		  
	   }
	   public static boolean isSafe(int x,int r,int c) {
		   for(int i=0;i<9;i++) {
			   if(board[r][i]==x)
				   return false;
		   }
		   for(int i=0;i<9;i++) {
			   if(board[i][c]==x)
				   return false;
		   }
		   int i=3*(r/3);
		   int j=3*(c/3);
		   for(int a=i;a<i+3;a++ ) {
			   for(int b=j;b<j+3;b++) {
				   if(board[a][b]==x)
					   return false;
				   
			   }
		   }
		   return true;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int board[][]=new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				board[i][j]=sc.nextInt();
			}
		}
		solve(0,0);
	   for(int i=0;i<9;i++) {
		   for(int j=0;j<9;j++) {
			   System.out.println(" "+board[i][j]);
		   }
		   System.out.println();
	   }
	}

}
