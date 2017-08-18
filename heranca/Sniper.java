package revisao.heranca;

public class Sniper extends Personagem {

	public Sniper(String name, int stamina, double life, double fullLife) {
		super(name, stamina, life, fullLife);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(IWeapon weapon, Personagem personagem) {

		if (this.stamina > 0) {
			weapon.damage(personagem);
			this.stamina -= (int) (this.stamina * 0.1);
		}
	}

}
