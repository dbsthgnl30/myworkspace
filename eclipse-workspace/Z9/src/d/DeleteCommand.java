package d;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDTO;

public class DeleteCommand implements Command{
	
	@Override
	public void go(Scanner sc) {

		System.out.println();
		
		boolena isOk = DB.db.remove(new MemberDTO(null, null, -1));
		
		
		
		
	}
}
