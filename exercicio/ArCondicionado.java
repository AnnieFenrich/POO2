package exercicio;

public class ArCondicionado extends Acessorios {	
	private Acessorios acessorios;

	public ArCondicionado(Acessorios acessorios) {
		this.acessorios=acessorios;
	}

	public String getDescricao(){
		return acessorios.getDescricao()+"\n*Ar Condicionado";
	}

	public double calcularCusto() {
		return acessorios.calcularCusto()+300;
	}

}
