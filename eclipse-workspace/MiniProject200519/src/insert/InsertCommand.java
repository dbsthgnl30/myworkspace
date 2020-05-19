package insert;

import java.util.Scanner;

import com.naver.MovieDAO;
import com.naver.MovieDTO;

import kr.co.ca.Command;

public class InsertCommand implements Command {
	@Override
	public void execute(Scanner sc) {
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요");
		String pwd = sc.nextLine();
		
		MovieDAO dao = new MovieDAO();
		dao.insert(new MovieDTO(id, pwd));
		
	}
}
