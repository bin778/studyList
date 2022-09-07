package day10;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 다섯개의 정수를 차례로 입력 받아서
		// 10짜리 배열에 순서대로 입력하기
		/*int[] ar1 = new int[10];
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			ar1[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("입력한 10개의 정수입니다.");
		for (int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " ");
		System.out.println();*/
		
		// 5짜리 배열에 순서대로 하기
		/*int[] ar1 = new int[5];
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			ar1[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("입력한 5개의 정수입니다.");
		for (int i = 0; i < ar1.length; i++)
			System.out.print(ar1[i] + " ");
		System.out.println();*/
		
		// 2. 배열 속에 저장된 요소들을 다음과 같이 출력하기
		// [10, 5, 8, 7, 15]		
		// int[] ar2 = {10, 5, 8, 7, 15};
		/*System.out.print("[");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i]);
			if (i < 4)
				System.out.print(", ");
		}
		System.out.println("]");*/
		
		// 빠른 for문
		/*System.out.print("[");
		for (int i : ar2) {
			System.out.print(i);
			if (i != 15)
				System.out.print(", ");
		}
		System.out.println("]");*/
		
		// 3. 해당 배열 속에서 최댓값을 찾아 출력하기
		// 최댓값 : 15
		/*int max = ar2[0];
		
		for (int i = 0; i < ar2.length; i++) {
			if (ar2[i] > max)
				max = ar2[i];
		}
		System.out.println("최대값 : " + max);*/
		
		// 4. 사용자에게 국어 수학 영어 점수를 차례로 입력 받아서
		// 평균점수 출력하기(배열의 활용하여)
		// 국어점수 >> 100
		// 영어점수 >> 100
		// 수학점수 >> 99
		// 평균점수 : 99.66점
		/*int[] score = new int[3];
		int total = 0;
		
		for (int i = 0; i < score.length; i++) {
			if (i == 0)
				System.out.print("국어점수 >> ");
			else if (i == 1)
				System.out.print("영어점수 >> ");
			else if (i == 2)
				System.out.print("수학점수 >> ");
			score[i] = Integer.parseInt(sc.nextLine());
			total += score[i];
		}
		System.out.printf("평균점수 : %.2f", (double)total / score.length);*/
	}
}
