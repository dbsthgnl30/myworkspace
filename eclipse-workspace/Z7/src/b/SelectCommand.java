package b;

import java.util.List;
import java.util.Scanner;

import com.naver.DB;
import com.naver.MemberDTO;

import kr.co.ca.Command;

public class SelectCommand implements Command {
	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		List<MemberDTO> memberList =  DB.db;
		for (int i = 0; i < memberList.size(); i ++  ) {
			MemberDTO dto =  DB.db.get(i);
			System.out.println(dto);
		}
		
		
	}
}
