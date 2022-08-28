package LeetCode;
import java.util.*;
public class Encodings {
	public static boolean findWay(int i,String s){
        if(i==0)
           return false;
       char a=s.charAt(i-1);
       char b=s.charAt(i);
       if((a =='1' || a=='2') && b <='6' ){
           return true;
       }
       return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int dp[]=new int[n+1];
        if(str.charAt(0)=='0'){
            System.out.println(0);
           return;
        }
        dp[0]=1;
        for(int i=1;i<=n;i++){
            int enc=0;
            if(str.charAt(i-1)=='0'){
               if(findWay(i-1,str)){
                    enc=0+dp[i-2];
                }
                else{
                    enc=0;
                }
            }
            else{
                if(findWay(i-1,str)){
                    enc=dp[i-1]+dp[i-2];
                }
                else{
                    enc=dp[i-1];
                }
            }
            dp[i]=enc;
        }
       for(int i=0;i<=n;i++) {
    	   System.out.println(dp[i]);
       }
    }

}
