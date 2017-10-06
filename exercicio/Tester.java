package exercicio;

public class Tester {

	public static void main(String[] args) {
		Acessorios ac = new Acessorios();
		ac = new ArCondicionado(ac);
		ac = new VidrosEletricos(ac);

		System.out.println(ac.getDescricao());
		System.out.println("Total de Acess�rios: " + ac.calcularCusto());

		Carro carro = new Carro("Chevrolet","Prisma",2016,"Vermelho",50000, ac);
		
		System.out.println("Total do Carro: " + carro.valor);
		System.out.println("Total do carro com acess�rios: " + (carro.total=carro.valor+ac.calcularCusto()));
	}
}