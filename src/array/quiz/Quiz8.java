package array.quiz;

public class Quiz8 {

	public static void main(String[] args) {

		
		Student [] studentInfo = new Student[3];
						
		studentInfo[0] = new Student("둘리", 1);
		studentInfo[1]= new Student("도우너", 2);
		studentInfo[2] = new Student("또치", 3);
		
		for (int i =0 ; i < studentInfo.length; i++) {
			studentInfo[i].showInfo();
		}
							
	}
	
}

class Student {
	String name;
	int studentNum;
			
	public Student(String name, int studentNum) {
		super();
		this.name = name;
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNum=" + studentNum + "]";
	}
	
	public void  showInfo() {
		System.out.println(studentNum + " 의 번호 학생은 " + name + " 입니다.");
	}
	
		
}