package LeetCode;
import java.util.*;
class CompImp implements Comparator <ArrayList <Integer>>{	
	public int compare(ArrayList <Integer> l1,ArrayList <Integer> l2) {
		for(int i=0;i<Math.min(l1.size(),l2.size());i++) {
			if(l1.get(i)!=l2.get(i)) {
				return l1.get(i)-l2.get(i);
			}
		}
		//return -1;
		if(l2.size()<=l1.size()) {
			return 1;
		}
		return -1;
	}	
}
public class ComparatorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompImp cmp=new CompImp();
		ArrayList <ArrayList<Integer>> list=new ArrayList<>();
		ArrayList <Integer> t1=new ArrayList<>();
		ArrayList <Integer> t2=new ArrayList<>();
		t2.add(1);
		t2.add(2);
		t2.add(3);
		
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		list.add(t1);
		list.add(t2);
		System.out.println(list);
		Collections.sort(list,cmp);	
		System.out.println(list);
	}

}
