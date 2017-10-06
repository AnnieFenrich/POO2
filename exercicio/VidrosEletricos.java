package exercicio;

public class VidrosEletricos extends Acessorios {	
	private Acessorios acessorios;

	public VidrosEletricos(Acessorios acessorios) {
		this.acessorios=acessorios;
	}

	public String getDescricao(){
		return acessorios.getDescricao()+"\n*Vidros Elétricos";
	}

	@Override
	public double calcularCusto() {
		return acessorios.calcularCusto()+150;
	}

}
