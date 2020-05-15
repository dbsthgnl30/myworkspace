package com.naver;

public abstract class Weapon {
	private String name;
	private int attackPower;
	
	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(String name, int attackPower) {
		super();
		this.name = name;
		this.attackPower = attackPower;
	}
	
	public void attack(Monster m) {
		attackOfWhat();
		
		int gHp =  m.getHp();
		int sHp =  gHp - attackPower;
		m.setHp(sHp);
		System.out.println("몬스터를 공격합니다");
		System.out.println("몬스터의 남은 hp는" + m);
	}
	
	public abstract void attackOfWhat();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "무기의 이름은" + name;
	}
}
