import java.util.*;
public class FBChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int w=sc.nextInt();
			int h=sc.nextInt();
			if(w<l || h<l) {
				System.out.println("UPLOAD ANOTHER");
			}
			else if(w==l && h==l) {
				System.out.println("Accepted");
			}
			else {
				System.out.println("Crop Photo");
			}
		}
	}

}
