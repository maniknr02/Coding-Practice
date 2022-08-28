import java.util.*;
public class GetSubsequence {

	public static ArrayList <String> solve(String s,int i) {
		if(i==s.length()) {
			ArrayList <String > temp=new ArrayList<>();
			temp.add("");
			return temp;
		}
		ArrayList <String> ans=new ArrayList<>();
		ArrayList <String> temp=solve(s,i+1);
		for(String j :temp) {
			ans.add(""+j);
			ans.add(s.charAt(i)+j);
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
