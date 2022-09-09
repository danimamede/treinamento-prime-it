
public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		// o uso do CHAR te deixa preso a apenas 1 character, e deve ser usado com aspas simples
		System.out.println(letra);
		
		// o char é, na verdade, um número da tabela unicode, não é muito usual
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		// STRING não é uma palavra-chave, por isso vemcom a inicial maiscula, é apenas uma referência
		// para uma String deve-se usar aspas duplas
		System.out.println(palavra);
		// é possível somar strings pois o compilador consegue concatenar essa soma por não ser de um tipo primitivo
	
		palavra = palavra + " 2020";
		System.out.println(palavra);
	}
}