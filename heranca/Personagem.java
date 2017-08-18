package revisao.heranca;

public abstract class Personagem {
	
	protected String name;
	protected int stamina;
	protected double life;
	protected double fullLife;
	
	
	
	public Personagem(String name, int stamina, double life, double fullLife) {
		super();
		this.name = name;
		this.stamina = stamina;
		this.life = life;
		this.fullLife = fullLife;
	}


	

	public int getStamina() {
		return stamina;
	}




	public void setStamina(int stamina) {
		this.stamina = stamina;
	}




	public double getLife() {
		return life;
	}




	public void setLife(double life) {
		this.life = life;
	}


	
	
	public double getfullLife() {
		return fullLife;
	}

	
	

	public abstract void attack(IWeapon weapon, Personagem personagem);
	
	

}
