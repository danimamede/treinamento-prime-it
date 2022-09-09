
public class TestaBanco {
	public static void main(String[] args) {
		Cliente dani = new Cliente();
		dani.nome = "Daniela Mamede";
		dani.cpf = "222.222.222-22";
		dani.profissao = "Programadora";
		
		Conta contaDani = new Conta();
		contaDani.deposita(100);
		
		contaDani.titular = dani;
		System.out.println(contaDani.titular.nome + ", " + contaDani.titular.cpf
				+ ", " + contaDani.titular.profissao + ". Saldo: "
				+ contaDani.getSaldo());
		
		// Outra forma de referenciação

		Conta contaMarcela = new Conta();
		contaMarcela.titular = new Cliente();
		
		contaMarcela.titular.nome = "Marcela Silveira";
		System.out.println(contaMarcela.titular);
		System.out.println(contaMarcela.titular.nome + ", " + contaMarcela.titular.cpf
				+ ", " + contaMarcela.titular.profissao + ". Saldo: "
				+ contaMarcela.getSaldo());
	}
}
