package exercicio.composicaoEstrategy;

public class BatalhaDeRobos {
	private Correr correr;
	private Atacar bater;
	private Defender defender;
	
	
	public double corre(Correr correr) {
		return correr.corre();
	}

	public double bate(Atacar bater) {
		return bater.bate();
	}

	public double defende(Defender defender) {
		return defender.defende();
	}

	public Correr getCorrer() {
		return correr;
	}

	public void setCorrer(Correr correr) {
		this.correr = correr;
	}

	public Atacar getBater() {
		return bater;
	}

	public void setBater(Atacar bater) {
		this.bater = bater;
	}

	public Defender getDefender() {
		return defender;
	}

	public void setDefender(Defender defender) {
		this.defender = defender;
	}

}
