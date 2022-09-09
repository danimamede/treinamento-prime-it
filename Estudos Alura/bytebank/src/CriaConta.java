public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(String.format("%.2f",primeiraConta.saldo));
		
		primeiraConta.saldo += 100;
		System.out.println(String.format("%.2f",primeiraConta.saldo));
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println(String.format("Saldo da primeira conta: R$%.2f", primeiraConta.saldo));		
		System.out.println(String.format("Saldo da segunda conta: R$%.2f", segundaConta.saldo));
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
	}
}
