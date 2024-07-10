package array.quiz;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {

		int [] arr = new int [5]  ;
		int result = 0;
		
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 ==0) {
//				arr[i / 2 -1] = i;
//				System.out.println(arr[i/2 -1]);		
//			}
//		}

		for (int i =1 ; i <=10; i++) {
			if (i % 2 ==0) {
				arr[result] = i;
				result++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
