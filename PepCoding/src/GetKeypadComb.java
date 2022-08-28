
import java.util.*;
public class GetKeypadComb {
	 static String keys[]= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	 public static ArrayList <String > solve(String s,int i){
		 if(i==s.length()) {
			 ArrayList <String>temp= new ArrayList<>();
			 temp.add("");
			 return temp;
		 }
		 ArrayList <String> ans=new ArrayList <>();
		 ArrayList <String> temp=solve(s,i+1);
		 for(String j : temp) {
			 String s1=keys[Integer.parseInt(String.valueOf(s.charAt(i)))];
			 for(int x=0;x<s1.length();x++) {
				 ans.add(s1.charAt(x)+j);
			 }
		 }
		 return ans;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList <String> sol=solve(s,0);
		System.out.println(sol);
		

	}

}
