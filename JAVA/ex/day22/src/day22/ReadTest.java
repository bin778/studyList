package day22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		// 파일 입력(읽어오기)
		//1. 파일객체만들기
		File f = new File("task.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			//2. 스트림열기
			fr = new FileReader(f);
			//3. 버퍼 열기
			br = new BufferedReader(fr);
			//4. 파일 입력(읽기)
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
			
//			String line = br.readLine();
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}	
			
			for(String line = br.readLine(); line != null; line = br.readLine()) {
				System.out.println(line);
			}
			
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// 버퍼닫기
				if(br != null) br.close();
				// 스트림닫기
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
