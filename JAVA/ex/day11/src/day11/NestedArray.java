package day11;

public class NestedArray {
	public static void main(String[] args) {
		int[][] arr = {//0�� 1�� 2��
					{1, 2, 3} , //0��
					{10, 20, 30}//1��
				};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length + 1; j++)
//			System.out.println("i: " + i + " j:" + j);
			System.out.println(arr[i][j]);
		}
		
	}
}
