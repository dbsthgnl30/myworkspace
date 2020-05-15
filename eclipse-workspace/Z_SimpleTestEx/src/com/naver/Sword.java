package com.naver;

public class Sword extends Weapon {
	
	public Sword() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Sword(String name, int attackPower) {
		super(name, attackPower);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void attackOfWhat() {
		System.out.println("검으로 공격합니다.");
		
	}
}
