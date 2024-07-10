package array.quiz;

public class Quiz2 {

	public static void main(String[] args) {

//		int [] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] intArr = {55, 1, 87, 11 ,33};
		int result = 0;
		
		for (int i = 0; i < intArr.length; i++) {
			if (i == 0 || i  ==  intArr.length -1) {
				result = intArr[i];
				System.out.println(result);
			}
		}
	}

}
