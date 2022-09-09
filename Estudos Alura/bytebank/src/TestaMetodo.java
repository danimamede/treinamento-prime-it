
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDani = new Conta();
		contaDani.titular = "Daniela Mamede";
		contaDani.saldo = 100;
		contaDani.deposita(50);
		
		System.out.println(contaDani.saldo);
		
		boolean conseguiuSacar = contaDani.saca(20);
		System.out.println(contaDani.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.titular = "Marcela Silveira";
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(300, contaDani)) {
			System.out.println("Transferência realizada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println(contaMarcela.titular + 
				", o saldo atual da sua conta é de " + contaMarcela.saldo);
		System.out.println("O saldo atual de " + contaDani.titular +
				" é de " + contaDani.saldo);
	}
}