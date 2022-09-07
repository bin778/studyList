package day22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	public static void main(String[] args) throws IOException {
		// ���Ͽ� ���
		// 1. ���ϰ�ü ����
		// �������� �Ű��������� ���ϰ�θ� �˷��ش�
		// ���� ������ ��� ������ ������ش�(���Ͽ� ����)
		// ���ϰ�� 2����
		// 1. ������ : "F:\\1700_java_choilb\\memo\\text.txt"
		// 2. ����� : ���� ������Ʈ ������ �������� �����ȴ�
		// 			   "F:\\1700_java_choilb\\workspace\\day22"
		//			   .. �� ���� ������ �ǹ��Ѵ�
		File f = new File("..\\..\\memo\\test.txt");
			
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 2. ��Ʈ�� ����
			fw = new FileWriter(f);
			// 2-1. ���� ����
			bw = new BufferedWriter(fw);
			// 3. ���� ����
			
			bw.write("����η� �����߽��ϴ�\n");
			bw.write("�ݰ����ϴ�\n");
				
		} catch (IOException e) {
			System.out.println("�����߻�");
		}finally {
			try {
				// 4-0. ���� �ݱ�
				if (bw != null) {
					bw.close();
				}	
				// 4. ��Ʈ�� �ݱ�
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

		
	}
}
