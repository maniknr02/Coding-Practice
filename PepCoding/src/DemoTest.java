import java.util.*;

public class DemoTest {

	public static void main(String[] args) {
		List <Integer> l=new ArrayList<>();
		Set <Integer> s=new HashSet<>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		s.addAll(l);
		l.addAll(s);
		System.out.println(l);
		System.out.println(s);


	}

}
