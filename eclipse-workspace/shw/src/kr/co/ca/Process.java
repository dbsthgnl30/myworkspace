package kr.co.ca;

import com.naver.Bow;

import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;
import com.naver.NoHaveWeaponException;
import java.util.Scanner;

public class Process {

	public static void main(String[] args) {
		boolean run = true;
		String message;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------");
			System.out.println("1. 무기선택 | 2. 공격 | 3. 종료");
			System.out.println("-----------");
			System.out.println("선택>");

		}

		if (message == "1. 무기선택") {
			
			message = sc.nextLine();
		}

		Monster m = new Monster(100);
		System.out.println(m);

		Weapon[] weapons = { new Bow("bow", 3), new Sword("sword", 7) };
		int hasWeaponIdx = 0;

		Hero fighter = new Hero(weapons, hasWeaponIdx);
		fighter.attack(m);

		
			try {
				fighter.changeWeapon(1);
			} catch (NoHaveWeaponException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
