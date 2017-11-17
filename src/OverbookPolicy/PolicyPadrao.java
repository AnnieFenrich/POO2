package OverbookPolicy;

public class PolicyPadrao extends OverbookPolicy {	

	@Override
	public void applyPolicy(Voo voo) {
		double limitePassageiros = voo.getAviao().getCapacidade() * 1.1;
		if (voo.getLista().size() == limitePassageiros) {
			
			int cont = 0;
			for (Passageiro passageiro: voo.getLista()){
				cont++;
				if (cont > voo.getAviao().getCapacidade()) {
					listaDosExcluidos.add(passageiro);
				}
				else {
					listaDosEmbarcados.add(passageiro);
				}
				
			}
		}
	}

}
