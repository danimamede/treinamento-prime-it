
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		// || -> or && -> and
		// = no Java atribui, == compara
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
				System.out.println("Infelizmente você não pode entrar.");
		}
		
		// Condição booleana
		
		int idadeIdoso = 68;
		boolean ehIdoso = idadeIdoso >= 65;
		System.out.println(ehIdoso);
		
		
	}
}
