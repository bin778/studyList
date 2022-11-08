package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import dto.UserDTO;

public class UserDAO {
	// id가 중복되는지 판단하는 메소드
	// 중복되면 true, 아니면 false
	public boolean isDup(String id) throws IOException {
		boolean check = false;
		BufferedReader br = new BufferedReader(new FileReader("..\\..\\resource\\user.txt"));
		
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			if(id.equals(line.split(",")[0])) {
				check = true;
			}
		}
		
		br.close();
		
		return check;
	}
	
	//회원가입 메소드 id가 중복된다면 false 실패, 중복되지 않으면 true 성공
	public boolean join(String id, String pw, String name, int age, String address) throws IOException {
		if(isDup(id)) {// 아이디가 중복되었다면
			return false;// false를 return하고 메소드 종료
		}
		
		// true를 넘겨주면 전체 내용을 유지하고 마지막 줄에 추가해줌
		BufferedWriter bw = new BufferedWriter(new FileWriter("..\\..\\resource\\user.txt", true));
		
		bw.write(id+","+pw+","+name+","+age+","+address+"\n");
		
		bw.close();
		return true;
	}
	
	// 회원탈퇴 메소드 id가 중복된다면 true 성공, 중복되지 않으면 false 실패
	public boolean delete(String id) throws IOException {
		UserDTO dto = null;
		if(isDup(id)) { // 아이디가 중복되었을 때만 실행
			// id : 찿고자 하는 회원 id
			BufferedReader br = new BufferedReader(new FileReader("..\\..\\resource\\user.txt"));
			// id가 일치하는 회원 아이디 찾기
			String data = "";
			for (String line = br.readLine(); line != null; line = br.readLine()) {
				String[] temp = line.split(",");
				dto = new UserDTO();// 찾은 회원의 5개 정보를 저장할 저장공간(객체)
				dto.id = temp[0];
				dto.pw = temp[1];
				dto.name = temp[2];
				dto.age = Integer.parseInt(temp[3]);
				dto.address = temp[4];
				
				if(id.equals(temp[0])) {
					data += "";
				} else {
					data += dto.id+","+dto.pw+","+dto.name+","+dto.age+","+dto.address+"\n";
				}
			}
			br.close();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("..\\..\\resource\\user.txt"));
			
			bw.write(data);
			bw.close();
			
			return true; // true를 return하고 메소드 종료
		}
		
		return false; // false를 return하고 메소드 종료
	}
	
	// id로 회원정보 가져오기
	// 만약 찾았다면 해당 회원의 5개 값이 들어있는 UserDTO 객체가 return,
	// 못찾았다면 null값이 return
	public UserDTO selectById(String id) throws IOException {
		UserDTO dto = null;

		// id : 찿고자 하는 회원 id
		BufferedReader br = new BufferedReader(new FileReader("..\\..\\resource\\user.txt"));
		// id가 일치하는 회원 정보 찾기
		for (String line = br.readLine(); line != null; line = br.readLine()) {
			String[] temp = line.split(",");
			if(id.equals(temp[0])) {
				dto = new UserDTO();// 찾은 회원의 5개 정보를 저장할 저장공간(객체)
				dto.id = temp[0];
				dto.pw = temp[1];
				dto.name = temp[2];
				dto.age = Integer.parseInt(temp[3]);
				dto.address = temp[4];
				break;
			}
		}
		
		br.close();
		
		return dto;
	}

	// 모든 회원 정보 보기
	public ArrayList<UserDTO> selectAll() throws IOException {
		// 회원들의 정보를 저장해줄 리스트(회원 한 명에 대한 5개의 값은 UserDTO 객체에 들어있음)
		ArrayList<UserDTO> list = new ArrayList<>();
		
		// F:\1700_java_choilb\workspace/webProject
		BufferedReader br = new BufferedReader(new FileReader("..\\..\\resource\\user.txt"));
		// 파일(데이터베이스) 읽기
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			// line에는 한 명의 5개 값이 ,로 연결되어있다.
			// "7GuQKTY6M,a1hk47ONE,원엽범,47,경기도"
			String[] temp = line.split(",");//{"7GuQKTY6M","a1hk47ONE","원엽범","47","경기도"}
			UserDTO dto = new UserDTO();
			dto.id = temp[0];
			dto.pw = temp[1];
			dto.name = temp[2];
			dto.age = Integer.parseInt(temp[3]);
			dto.address = temp[4];
			list.add(dto);
		}
		
		br.close();
		
		return list;
				
	}
	
}
