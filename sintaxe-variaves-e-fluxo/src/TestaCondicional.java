
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadedePessoas = 3;
		
		if (idade >=18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} 
		else {
			if(quantidadedePessoas >=2) {
				System.out.println("voce nao tem 18, mas pode entrar, " + "pois esta acompanhado");	
			}
			else {
				System.out.println("infelizmente você não pode entrar");
			}
		}
	}
	
}
