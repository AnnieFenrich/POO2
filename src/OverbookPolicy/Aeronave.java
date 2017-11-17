package OverbookPolicy;

public class Aeronave {

	private int id;
	private int capacidade;
	private String modelo;

    public Aeronave() {
        
    }
        
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Aeronave(String modelo, int capacidade) {
		super();
		this.capacidade = capacidade;
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int numero) {
		this.id = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

    @Override
    public String toString() {
        return getModelo();
    }
        
        

}
