package arraylist.quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');

		for (int i= 0; i<list.size(); i++) {
			char ch1 = list.get(i);
			System.out.println(ch1);	
		}
		
		
		
	}

}
