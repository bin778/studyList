package day11;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    // 1. ����ڿ��� �ټ����� ������ ���ʷ� �Է� �޾Ƽ�
	    // �Է��� ���� ���� : 10
	    
	    // 5ĭ ¥�� �迭�� ������� �����ϱ�
	    /*int[] numbers = new int[5];
	 
	    for (int i = 0; i < numbers.length; i++) {
	       System.out.print("����"+(i+1) + "�Է� >> ");
	       numbers[i] = Integer.parseInt(sc.nextLine());
	    }*/
	    
//	    numbers[0] = Integer.parseInt(sc.nextLine());
//	    numbers[1] = Integer.parseInt(sc.nextLine());
//	    numbers[2] = Integer.parseInt(sc.nextLine());
//	    numbers[3] = Integer.parseInt(sc.nextLine());
//	    numbers[4] = Integer.parseInt(sc.nextLine());
	    
	    // numbers {10, 5, 8, 7, 15}
	    // 2. �迭 �ӿ� ����� ��ҵ��� ������ ���� ����ϱ�
	    // [10, 5, 8, 7, 15, ] --> [10, 5, 8, 7, 15]
	    /*String res = "[";
	    for (int i = 0; i < numbers.length; i++) {
	    	if (i == numbers.length - 1) {// i�� �迭�� ���� -1 == i�� ������ �϶� 
	    		res += numbers[i];
	    	}
	    	else {
	    		res += numbers[i] + ", ";
	    	}
		}
	    res += "]";
	    
	    System.out.println(res);*/
	    // ���� for��
	    
	    // 3. �ش� �迭 �ӿ��� �ִ��� ã�� ����ϱ�
	    // �ִ� : 15
	    /*int max = numbers[0];
	    for (int i = 0; i < numbers.length; i++) {
	    	if(max < numbers[i]) {
	    		max = numbers[i];
	    	}
	    }
	    System.out.println("�ִ� : " + max);*/
	    
	    
	          
	    // 4. ����ڿ��� ���� ���� ���� ������ ���ʷ� �Է� �޾Ƽ�
	    // ������� ����ϱ�(�迭�� Ȱ���Ͽ�)
	    // �������� >> 100
	    // �������� >> 100
	    // �������� >> 99
	    // ������� : 99.66��
	    int[] scores = new int[3];
	    String[] subjects = {"����", "����", "����"};
	    
	    for (int i = 0; i < scores.length; i++) {	    	
	    	System.out.print(subjects[i] + "���� �Է� >> ");
			scores[i] = Integer.parseInt(sc.nextLine());
	    }

	   int total = 0;
	   for(int score : scores) {
		   total += score;
	   }
	   
//	   for (int i = 0; i < scores.length; i++) {
//		   total += scores[i];
//	   }
	   System.out.println("��� : " + total / 3.0 + "��");
	}
}
