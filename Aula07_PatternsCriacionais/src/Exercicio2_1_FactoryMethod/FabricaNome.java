package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author Lucas Ribeiro Rios 816114323
 * 		
 *
 */
public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
