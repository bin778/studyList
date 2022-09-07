package day11;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    // 1. 사용자에게 다섯개의 정수를 차례로 입력 받아서
	    // 입력할 정수 갯수 : 10
	    
	    // 5칸 짜리 배열에 순서대로 저장하기
	    /*int[] numbers = new int[5];
	 
	    for (int i = 0; i < numbers.length; i++) {
	       System.out.print("정수"+(i+1) + "입력 >> ");
	       numbers[i] = Integer.parseInt(sc.nextLine());
	    }*/
	    
//	    numbers[0] = Integer.parseInt(sc.nextLine());
//	    numbers[1] = Integer.parseInt(sc.nextLine());
//	    numbers[2] = Integer.parseInt(sc.nextLine());
//	    numbers[3] = Integer.parseInt(sc.nextLine());
//	    numbers[4] = Integer.parseInt(sc.nextLine());
	    
	    // numbers {10, 5, 8, 7, 15}
	    // 2. 배열 속에 저장된 요소들을 다음과 같이 출력하기
	    // [10, 5, 8, 7, 15, ] --> [10, 5, 8, 7, 15]
	    /*String res = "[";
	    for (int i = 0; i < numbers.length; i++) {
	    	if (i == numbers.length - 1) {// i가 배열의 길이 -1 == i가 마지막 일때 
	    		res += numbers[i];
	    	}
	    	else {
	    		res += numbers[i] + ", ";
	    	}
		}
	    res += "]";
	    
	    System.out.println(res);*/
	    // 빠른 for문
	    
	    // 3. 해당 배열 속에서 최댓값을 찾아 출력하기
	    // 최댓값 : 15
	    /*int max = numbers[0];
	    for (int i = 0; i < numbers.length; i++) {
	    	if(max < numbers[i]) {
	    		max = numbers[i];
	    	}
	    }
	    System.out.println("최댓값 : " + max);*/
	    
	    
	          
	    // 4. 사용자에게 국어 수학 영어 점수를 차례로 입력 받아서
	    // 평균점수 출력하기(배열을 활용하여)
	    // 국어점수 >> 100
	    // 영어점수 >> 100
	    // 수학점수 >> 99
	    // 평균점수 : 99.66점
	    int[] scores = new int[3];
	    String[] subjects = {"국어", "영어", "수학"};
	    
	    for (int i = 0; i < scores.length; i++) {	    	
	    	System.out.print(subjects[i] + "점수 입력 >> ");
			scores[i] = Integer.parseInt(sc.nextLine());
	    }

	   int total = 0;
	   for(int score : scores) {
		   total += score;
	   }
	   
//	   for (int i = 0; i < scores.length; i++) {
//		   total += scores[i];
//	   }
	   System.out.println("평균 : " + total / 3.0 + "점");
	}
}
