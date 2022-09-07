package day22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTask {
	public static void main(String[] args) {	
		// File 객체 만들기
		File task = new File("..\\..\\memo\\task.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
				
		try {
			// 스트림 생성
			fw = new FileWriter(task);
			// 버퍼 생성
			bw = new BufferedWriter(fw);
			// day22 프로젝트 폴더 내에
			// task.txt 파일을 만들어서
			// 1번째줄입니다
			// 2번째줄입니다
			// ...
			// 10번재줄입니다.
			// 출력하기
			for (int i = 0; i < 10; i++) {
				bw.write(i + 1 + "번째줄입니다\n");
			}
				
		} catch (IOException e) {
			System.out.println("오류발생");
		}finally {
			try {
				// 버퍼닫기
				if (bw != null) bw.close();
				// 스트림닫기
				if (fw != null) fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}
