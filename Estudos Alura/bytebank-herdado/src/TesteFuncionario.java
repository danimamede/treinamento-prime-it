public class TesteFuncionario {
	
    public static void main(String[] args) {
    	
    	Funcionario daniela = new Funcionario();
        daniela.setNome("Daniela Mamede");
        daniela.setCpf("111111111-11");
        daniela.setSalario(2600.00);
    	
        System.out.println(daniela.getNome());
        System.out.println(daniela.getBonificacao());
        
    }
}