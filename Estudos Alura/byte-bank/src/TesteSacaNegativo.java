
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta ();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		System.out.println(conta.getSaldo());
	
		
		
//		// Proibido - colocando private na frente da variavel na classe
//		// torna-se então impossivel editar ou ver, para ver cria-se um novo metodo
		// chama-se ENCAPSULAMENTO
//		conta.saldo -= 101;
//		System.out.println(conta.saldo);
		
	}
}
