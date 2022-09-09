class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// Exemplo de método sem retorno (void)
	
	public void deposita(double valor) {
		this.saldo += valor;
		
		// o uso da keyword THIS é opcional pois isso já acontece mesmo sem ela
		// nesse caso que estamos aprendendo
	}
	
	// Exemplos de métodos com retorno booleano
	
	public boolean saca(double valor) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}