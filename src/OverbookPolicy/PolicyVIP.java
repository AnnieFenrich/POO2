package OverbookPolicy;

public class PolicyVIP extends OverbookPolicy {

    @Override
    public void applyPolicy(Voo voo) {
        double limitePassageiros = voo.getAviao().getCapacidade() * 1.1;        
        if (voo.getLista().size() == limitePassageiros) {
            int cont = 0;
            for (Passageiro passageiro: voo.getLista()){
                cont++;
                if (cont > voo.getAviao().getCapacidade()) {
                    if(passageiro.getCategoria() == "VIP"){
                        //OBJETIVO DESSE TRECHO DE CÃ“DIGO: ELIMINAR DO VOO OS NORMAIS PARA INSERIR OS VIPs
                        excluirUltimoNormal(voo);
                    } else {
                        listaDosExcluidos.add(passageiro);
                    }
                } else {
                    listaDosEmbarcados.add(passageiro);
                }
            }
        }
    }
    
    //MÉTODO QUE VÊ O ÚLTIMO NORMAL ADICIONADO E EXCLUI ELE
    public void excluirUltimoNormal (Voo voo) {
        int tamanhoDaLista = voo.getLista().size();
        for (Passageiro passageiro : voo.getLista()){
            for(int i=tamanhoDaLista;i<=tamanhoDaLista;i--){
                if (passageiro.getCategoria() != "VIP") {
                    listaDosEmbarcados.remove(passageiro);
                    break;
                }
            }
        }
    }
}

		
	

