package revisao.heranca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		//CRIAÇÃO DAS VARIÁVEIS
		int i = 0;
		Personagem vencedor;
		Personagem atacante;
		IWeapon arma;
		Personagem alvo;
		List<Personagem> participantes = new ArrayList<>();
		List<IWeapon> armas = new ArrayList<>();
		
		//CRIAÇÃO DOS PERSONAGENS
		Personagem arqueiro = new Archer("Arqueiro", 50, 100, 100);
		participantes.add(arqueiro);
		Personagem Cowboy = new Cowboy("Menino das Vacas", 50, 100, 100);
		participantes.add(Cowboy);
		Personagem Knight = new Knight("Cavaleiro", 50, 100, 100);
		participantes.add(Knight);
		Personagem Sniper = new Sniper("Atirador", 50, 100, 100);
		participantes.add(Sniper);
		Personagem Wizard = new Wizard("Bruxo", 50, 100, 100);
		participantes.add(Wizard);
		
		//CRIAÇÃO DAS ARMAS
		IWeapon arco = new Archery();
		armas.add(arco);
		IWeapon corda = new Rope();
		armas.add(corda);
		IWeapon espada = new Sword();
		armas.add(espada);
		IWeapon rifle = new AwpRifle();
		armas.add(rifle);
		IWeapon spell = new Spell();
		armas.add(spell);
			
		while (participantes.size() > 1) {
			i++;
			//EMBARALHANDO TUDO
			Collections.shuffle(participantes);
			atacante = participantes.get(0);
			alvo = participantes.get(1);
			Collections.shuffle(armas);
			arma = armas.get(0);
			//AINDA TEM FORÇA?
			if(atacante.getStamina()>0) {
				//APRESENTANDO OS DUELISTAS
				System.out.println(i+"ª BATALHA!!!");
				System.out.println("Atacante: "+atacante.name+".");
				System.out.println("Vida: "+atacante.getLife()+" - Stamina: "+atacante.getStamina());
				System.out.println("Alvo: "+alvo.name+".");
				System.out.println("Vida: "+alvo.getLife()+" - Stamina: "+alvo.getStamina());
				//QUE A GUERRA COMECE
				atacante.attack(arma, alvo);
				//RESULTADOS
				System.out.println("--- RESULTADO DA BRIGA ---");
				System.out.println("Atacante: "+atacante.name+".");
				System.out.println("Vida: "+atacante.getLife()+" - Stamina: "+atacante.getStamina());
				System.out.println("Alvo: "+alvo.name+".");
				System.out.println("Vida: "+alvo.getLife()+" - Stamina: "+alvo.getStamina()+"\n \n \n \n ");
				//SERÁ QUE MORREU?
				if(alvo.getLife()<=0) {
					participantes.remove(alvo);
				}
				
			} else break;
		}
		vencedor=participantes.get(0);
		System.out.println("Vencedor: "+vencedor.name+".");
		System.out.println("Vida: "+vencedor.getLife()+" - Stamina: "+vencedor.getStamina()+".");
	}

}
