package revisao.heranca;

public class AwpRifle implements IWeapon {

	@Override
	public void damage(Personagem personagem) {
		personagem.setLife(personagem.getLife()-personagem.getfullLife()*0.32);

	}

}
