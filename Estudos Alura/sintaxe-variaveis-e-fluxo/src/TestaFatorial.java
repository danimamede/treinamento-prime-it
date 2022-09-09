
public class TestaFatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for(int i = 1; i <= 5; i++) {
			fatorial *= i;
			// fatorial = fatorial * i;
			System.out.println(i + "! = " + fatorial);
		}
	}
}
