package com.naver;

public class Hammer extends Weapon {
	
	public Hammer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Hammer(String name, int attackPower) {
		super(name, attackPower);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void attackOfWhat() {
		System.out.println("망치로 공격합니다.");
		
	}
}
