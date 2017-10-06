package exercicio;

public class Carro {
	public String marca;
	public String nome;
	public int ano;
	public String cor;
	public double valor;
	public Acessorios acessorios;
	public double total;
	
	public Carro(String marca, String nome, int ano, String cor, double valor, Acessorios acessorios) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.ano = ano;
		this.cor = cor;
		this.valor = valor;
		this.acessorios = acessorios;
	}
		
	public Carro() {}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Acessorios getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(Acessorios acessorios) {
		this.acessorios = acessorios;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", nome=" + nome + ", ano=" + ano + ", cor=" + cor + ", acessorios="
				+ acessorios + "]";
	}
	
}
