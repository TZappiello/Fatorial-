import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Fatorial: ");
		int n = sc.nextInt();
		int f = 1;

		while (n > 1) {
			f = f * n;
			n--;
		}
		System.out.println("O valor do fatorial de: " + n + " é igual a :" + f);

	}

}
