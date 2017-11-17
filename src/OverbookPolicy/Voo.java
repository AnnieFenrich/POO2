package OverbookPolicy;

import java.util.ArrayList;
import java.util.List;

public class Voo {

	private int numero;
	private Aeronave aviao;
	private OverbookPolicy overbookPolicy;
        private Passageiro passageiro;
        private ArrayList embarcados;

    public Voo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public Aeronave getAviao() {
		return aviao;
	}

	public void setAviao(Aeronave aviao) {
		this.aviao = aviao;
	}
	
	public OverbookPolicy getOverbookPolicy() {
		return overbookPolicy;
	}

	public Voo(int numero, Aeronave aviao, OverbookPolicy overbookPolicy, Passageiro passageiro) {
		this.numero = numero;
		this.aviao = aviao;
		this.overbookPolicy = overbookPolicy;
                this.passageiro = passageiro;
	}

	public static List<Passageiro> lista = new ArrayList<Passageiro>();

	public void embarcar(Passageiro passageiro) {
		
		if (lista.equals(passageiro)) {
			
		}
		
		passageiro.setPoltrona(lista.size() + 1);
		if (lista.size() >= aviao.getCapacidade()) {
			passageiro.setPoltrona(0);
		}
		lista.add(passageiro);
		
		encerrarEmbarque();
	}

	public List<Passageiro> getLista() {
		return lista;
	}

	public void setLista(List<Passageiro> lista) {
		this.lista = lista;
	}

	private void applyPolicy() {
		overbookPolicy.applyPolicy(this);
	}

	public void encerrarEmbarque() {
		this.applyPolicy();
	}

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
        
        
}
