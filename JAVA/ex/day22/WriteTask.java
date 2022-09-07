package day22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTask {
	public static void main(String[] args) {	
		// File ��ü �����
		File task = new File("..\\..\\memo\\task.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
				
		try {
			// ��Ʈ�� ����
			fw = new FileWriter(task);
			// ���� ����
			bw = new BufferedWriter(fw);
			// day22 ������Ʈ ���� ����
			// task.txt ������ ����
			// 1��°���Դϴ�
			// 2��°���Դϴ�
			// ...
			// 10�������Դϴ�.
			// ����ϱ�
			for (int i = 0; i < 10; i++) {
				bw.write(i + 1 + "��°���Դϴ�\n");
			}
				
		} catch (IOException e) {
			System.out.println("�����߻�");
		}finally {
			try {
				// ���۴ݱ�
				if (bw != null) bw.close();
				// ��Ʈ���ݱ�
				if (fw != null) fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}
