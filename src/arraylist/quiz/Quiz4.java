package arraylist.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		
		// 선언 후 객체를 넣는다.
//		Student student = new Student(1001, "둘리");
		
		// 선언하면서 동시에 객체를 넣는다.
		list.add(new Student (1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		// get 메소드를 통해 출력
//		Student student1 = list.get(0);
//		student1.showInfo();
//		Student student2 = list.get(1);
//		student2.showInfo();
//		Student student3 = list.get(2);
//		student3.showInfo();

	// 반복문을 이용해 출력	
		for (int i= 0; i< list.size(); i++) {
			Student stu = list.get(i);
			stu.showInfo();
		}
	}
}

class Student {
	int studentNum;
	String name;
	
	
	// 생성자 생성
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}


	public void showInfo() {
		System.out.println("학번은 : " + studentNum + " 이름은 : " + name);
	}
	
	
}