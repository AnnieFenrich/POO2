package revisao.heranca;



public class Sword implements IWeapon{

	@Override
	public void damage(Personagem personagem) {
		personagem.setLife(personagem.getLife()-personagem.getfullLife()*0.12);
	}

}
