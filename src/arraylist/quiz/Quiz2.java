package arraylist.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		// 일반 get 메소드 출력 방식
		for (int i=0 ; i < list.size(); i++) {
						boolean bool = list.get(i);
						System.out.println(bool);				
		}
		
		// 람다식
//		for (Boolean b : list) {
//			System.out.println(b);
//		}
		
		System.out.println();
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));

		
		
		
	}

}
