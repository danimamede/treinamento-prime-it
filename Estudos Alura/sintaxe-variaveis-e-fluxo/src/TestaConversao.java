
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		// a sentença acima foi feita com um CASTING, que atribui o valor de um tipo de variável a outro tipo de variável
		// dessa forma conseguimos "forçar" o compilador com essa conversão entre double e int
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
				
		// Os quatro tipos de tipo primitivo são: int, long, byte e short. Quanto aos tipos flutuantes, além do double, há o float e,
		// se tentarmos definir a variável como recebendo 3.14, ocorre o mesmo problema do long, mesmo se tratando de ponto flutuante.
		// Para o Java, 3.14 é um double com 64bits. É um valor que cabe em um tipo flutuante com 32bits?
		// Não, e informações podem ser perdidas. Neste caso, usa-se o casting, o que seria estranho, ou se indica que este literal,
		// o valor 3.14, é um float, colocando-se "f" no fim:
		
		float pontoFlutuante = 3.14f;
		// nao é muito usual pois o double tem 64bits enquanto o float tem apenas 32
		// sendo necessário então realizar o casting com (float) ou então colocar o f no final
		long numeroGrande = 32158646123l;
		//64 bits,o int no Java vai até 32bits, números maiores, de 64 bits, usa-se o LONG
		short valorPequeno = 2131;
		byte b = 127;
		
		System.out.println(total);
		// That's because .1 cannot be represented exactly in a binary floating point representation
	}
}
