package day23;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) throws IOException {
		// 읽기 전용 파일
		File task1 = new File("..\\..\\memo\\task.txt");
		// 쓰기 전용 파일
		File task2 = new File("..\\..\\memo\\task2.txt");
		
		// 파일 객체 만들기
		FileWriter fw = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		Scanner sc = new Scanner(System.in);
		int input_address; // 삽입 위치
		String input_content, contents = ""; // 삽입 내용, 전체 내용
		
		try {
			// 읽기 전용 스트림 생성
			fr = new FileReader(task1);
			// 읽기 전용 버퍼 생성
			br = new BufferedReader(fr);
			
			// 삽입 위치와 삽입 내용 입력
			System.out.print("삽입 위치 >> ");
			input_address = Integer.parseInt(sc.nextLine());
			System.out.print("삽입 내용 >> ");
			input_content = sc.nextLine();
			
			// contents 문자열에 파일 내용과 추가할 내용 삽입
			for (int i = 0; i < 11; i++) {
				if (input_address - 1 == i)
					contents += input_content + "\n";
				else
					contents += br.readLine() + "\n";
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// 읽기 전용 스트림 닫기
				if (fr != null) fr.close();
				// 읽기 전용 버퍼 닫기
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 삽입 후 내용 확인
		System.out.println("\n삽입 후 >>");
		System.out.println(contents);
		
		try {
			// 쓰기 전용 스트림 생성
			fw = new FileWriter(task2);
			// 쓰기 전용 버퍼 생성
			bw = new BufferedWriter(fw);
			
			// 파일 내용 쓰기
			bw.write(contents);
			System.out.println("삽입 완료!");
				
		} catch (IOException e) {
			System.out.println("오류발생");
		}finally {
			try {
				// 쓰기 전용 스트림 닫기
				if (bw != null) bw.close();
				// 쓰기 전용 버퍼 닫기
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
