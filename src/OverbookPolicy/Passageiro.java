package OverbookPolicy;

public class Passageiro {

        private int id;
	private String nome;
	private String cpf;
	private String categoria;
	private int poltrona;

        public Passageiro (){
        }
        
        
	Passageiro(String nome, String cpf, String categoria) {

		this.nome = nome;
		this.cpf = cpf;
		this.categoria = categoria;
	}

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        } 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCpf() {
		return cpf;
	}

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        

	public int getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passageiro other = (Passageiro) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Passageiro [nome=" + nome + ", cpf=" + cpf + ", categoria="
				+ categoria + ", poltrona=" + poltrona + "]";
	}
}
