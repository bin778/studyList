package day22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		// ���� �Է�(�о����)
		//1. ���ϰ�ü�����
		File f = new File("task.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			//2. ��Ʈ������
			fr = new FileReader(f);
			//3. ���� ����
			br = new BufferedReader(fr);
			//4. ���� �Է�(�б�)
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
				// ���۴ݱ�
				if(br != null) br.close();
				// ��Ʈ���ݱ�
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
