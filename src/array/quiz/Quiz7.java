package array.quiz;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {

		char arr[] = {'a' , 'b', 'c' , 'd', 'e' };
		char newArr[] = new char[2];
		
		// 원본배열, 시작위치, 새배열, 시작위치, 개수
		System.arraycopy(arr, 3, newArr,0, 2);
		
		System.out.println("원본 배열 : " + Arrays.toString(arr));
		System.out.println("원본 배열 : " + Arrays.toString(newArr));
		
		
	}

}
