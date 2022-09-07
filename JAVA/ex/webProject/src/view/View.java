package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class View {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO();
		
		while(true) {
			System.out.println("--website menu--");
			System.out.println("1.회원가입");
			System.out.println("2.회원탈퇴");
			System.out.println("3.회원정보검색");
			System.out.println("4.모든회원정보보기");
			System.out.println("5.종료하기");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				System.out.print("id >> ");
				String id = sc.nextLine();
				System.out.print("pw >> ");
				String pw = sc.nextLine();
				System.out.print("name >> ");
				String name = sc.nextLine();
				System.out.print("age >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("address >> ");
				String address = sc.nextLine();
				
				if(dao.join(id, pw, name, age, address)) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("중복된 id 존재합니다");
				}
				
			}else if(choice == 2) {	
				System.out.print("탈퇴할 id >> ");
				String id = sc.nextLine();
				if(dao.delete(id)) {
					System.out.println("탈퇴성공!");
				}else {
					System.out.println("해당id가 존재하지 않습니다");
				}
			}else if(choice == 3) {
				// id로 검색
				System.out.print("검색할 id >> ");
				String target = sc.nextLine();
				UserDTO dto = dao.selectById(target);
				
				if(dto == null) {
					System.out.println(target+" id 검색 결과가 없습니다");
				}else {
					System.out.println("|["+dto.id+"]회원정보--");
					System.out.println("|비밀번호 : "+dto.pw);
					System.out.println("|이름 : "+dto.name);
					System.out.println("|나이 : "+dto.age);
					System.out.println("|주소 : "+dto.address);
				}
				
			}else if(choice == 4) {
				ArrayList<UserDTO> list = dao.selectAll();
				for (UserDTO dto : list) {
					System.out.println("|["+dto.id+"]회원정보--");
					System.out.println("|비밀번호 : "+dto.pw);
					System.out.println("|이름 : "+dto.name);
					System.out.println("|나이 : "+dto.age);
					System.out.println("|주소 : "+dto.address);
				}
			}else if(choice == 5) {
				System.out.println("program finished");
				break;
			}else {
				System.out.println("wrong value");
			}
			System.out.println();
			
		}
		
	}
}
