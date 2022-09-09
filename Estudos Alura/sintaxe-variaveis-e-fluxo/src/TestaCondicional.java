
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem vindo!");
		}
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 mas pode entrar pois está acompahado");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
		}
		
		// Condição booleana
		
		int idadeIdoso = 68;
		boolean ehIdoso = idadeIdoso >= 65;
		System.out.println(ehIdoso);
	}
}
