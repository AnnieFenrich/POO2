/*package OverbookPolicy;

public class Testador {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao(1,"A330",10);
		//Aviao aviao2 = new Aviao(1,"Boeing 727",20);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyPadrao());
		voo1.embarcar(new Passageiro("Coitado","1",Categoria.VIP));
		voo1.embarcar(new Passageiro("Joana","2",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Ash","3",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Garen","4",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Master y","5",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Jynx","6",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Tristana","7",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Bardo","8",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Ezimo","9",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Pikachu","10",Categoria.COMUM));
		voo1.embarcar(new Passageiro("Blastoise","11",Categoria.COMUM));
		
		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro: voo1.getOverbookPolicy().getListaDosEmbarcados()){
			System.out.println(passageiro);
		}
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro: voo1.getOverbookPolicy().getListaDosExcluidos()){
			System.out.println(passageiro);
		}
	}

}
*/