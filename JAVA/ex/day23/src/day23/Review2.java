package day23;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Review2 {
	public static void main(String[] args) throws IOException {
		// ���� ����� ���� ����
		File task = new File("..\\..\\memo\\task2.txt");
		
		// ���� ��ü �����
		FileWriter fw = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		Scanner sc = new Scanner(System.in);
		int input_address; // ���� ��ġ
		String input_content, contents = ""; // ���� ����, ��ü ����
		
		try {
			// �б� ���� ��Ʈ�� ����
			fr = new FileReader(task);
			// �б� ���� ���� ����
			br = new BufferedReader(fr);
			
			// ���� ��ġ�� ���� ���� �Է�
			System.out.print("���� ��ġ >> ");
			input_address = Integer.parseInt(sc.nextLine());
			System.out.print("���� ���� >> ");
			input_content = sc.nextLine();
			
			// contents ���ڿ��� ���� ����� �߰��� ���� ����
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
				// �б� ���� ��Ʈ�� �ݱ�
				if (fr != null) fr.close();
				// �б� ���� ���� �ݱ�
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ���� �� ���� Ȯ��
		System.out.println("\n���� �� >>");
		System.out.println(contents);
		
		try {
			// ���� ���� ��Ʈ�� ����
			fw = new FileWriter(task);
			// ���� ���� ���� ����
			bw = new BufferedWriter(fw);
			
			// ���� ���� ����
			bw.write(contents);
			System.out.println("���� �Ϸ�!");
				
		} catch (IOException e) {
			System.out.println("�����߻�");
		}finally {
			try {
				// ���� ���� ��Ʈ�� �ݱ�
				if (bw != null) bw.close();
				// ���� ���� ���� �ݱ�
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

