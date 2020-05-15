package b;

import java.util.Scanner;

import kr.co.ca.Command;
import kr.co.ca.DB;
import kr.co.ca.MemberDTO;

public class SelectCommand implements Command{
	@Override
	public void go(Scanner sc) {
		for (int i = 0; i < DB.db.size(); i ++) {
			MemberDTO d =  DB.db.get(i);
			System.out.println(d);
		}
		
	}
}
