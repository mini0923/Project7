package arraylist.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		for (String st : list) {
			System.out.println(st);
		}

		System.out.println("추가 후 사이즈는 : " + list.size());

//		for (int i =0 ; i < 5; i++) {
//			list.remove(0);
//		}
		
		for (int i = list.size() -1 ; i >= 0; i--) {
			list.remove(i);
		}
	
				
		System.out.println("삭제된 후 사이즈는 : " + list.size());
		
		
		
		
	}

}
