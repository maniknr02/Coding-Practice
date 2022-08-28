import java.util.*;
public class MinCostPaintHouse {
	 public static void main(String[] args) throws Exception {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int cost[][]=new int[n][3];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<3;j++){
	                cost[i][j]=sc.nextInt();
	            }
	        }
	        int r=0;
	        int g=0;
	        int b=0;
	        for(int i=0;i<n;i++){
	            int tr=r,tb=b,tg=g;
	            r=cost[i][0]+Math.min(tg,tb);
	            g=cost[i][1]+Math.min(tr,tb);
	            b=cost[i][2]+Math.min(tr,tg);
	            System.out.println(" "+r+" "+g+" "+b);
	            
	        }
	        System.out.println(Math.min(r,Math.min(g,b)));
	    }

}
