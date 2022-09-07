package day22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	public static void main(String[] args) throws IOException {
		// 파일에 출력
		// 1. 파일객체 생성
		// 생성자의 매개변수에는 파일경로를 알려준다
		// 없는 파일일 경우 파일을 만들어준다(파일에 쓰기)
		// 파일경로 2가지
		// 1. 절대경로 : "F:\\1700_java_choilb\\memo\\text.txt"
		// 2. 상대경로 : 현재 프로젝트 폴더가 기준으로 설정된다
		// 			   "F:\\1700_java_choilb\\workspace\\day22"
		//			   .. 은 상위 폴더를 의미한다
		File f = new File("..\\..\\memo\\test.txt");
			
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 2. 스트림 생성
			fw = new FileWriter(f);
			// 2-1. 버퍼 생성
			bw = new BufferedWriter(fw);
			// 3. 파일 쓰기
			
			bw.write("상대경로로 접근했습니다\n");
			bw.write("반갑습니다\n");
				
		} catch (IOException e) {
			System.out.println("오류발생");
		}finally {
			try {
				// 4-0. 버퍼 닫기
				if (bw != null) {
					bw.close();
				}	
				// 4. 스트림 닫기
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

		
	}
}
