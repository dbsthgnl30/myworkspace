package com.naver;

public class Monster {
	private int hp;
	
	public Monster() {
		// TODO Auto-generated constructor stub
	}

	public Monster(int hp) {
		super();
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Monter의 hp는" + hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}
