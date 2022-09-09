
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(142, 6548);
		conta.setNumero(1337);
		conta.deposita(200);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		
		Cliente dani = new Cliente();
		//conta.titular = paulo;
		
		conta.setTitular(dani);
		dani.setNome("Daniela Mamede");
		System.out.println(conta.getTitular().getNome());
		System.out.println(dani.getNome());
		
		conta.getTitular().setProfissao("Programadora");
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(dani.getProfissao());
	}
}
