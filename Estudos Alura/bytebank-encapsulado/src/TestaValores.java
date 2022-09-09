
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(142, 6548);
		// esse pareteses sempre está passando por um construtor, que é
		// uma rotina de inicialização, se você definir pode criar especificações
		
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
		
		System.out.println("Sua agência é: " + conta.getAgencia());
		
		Conta conta2 = new Conta(142, 6549);
		Conta conta3 = new Conta(142, 6550);
		
		System.out.println("O total de contas é " + Conta.getTotal());
		// Para invocar algo da classe o getter precisa ser static também
		
//		System.out.println("O total de contas é " + Conta.total);
//		Caso o atributo não seja privado
	}
}