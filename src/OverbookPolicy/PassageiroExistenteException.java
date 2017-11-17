
package OverbookPolicy;

@SuppressWarnings("serial")
public class PassageiroExistenteException extends RuntimeException{

	public PassageiroExistenteException(){
		super("Passageiro j existe na lista deste voo!");
	}
}
