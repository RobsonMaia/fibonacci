import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int s, n1 = 0, n2 = 1;

		System.out.print("Quntos termos da série de FIBONACCI você quer ver? ");
		s = sc.nextInt();
		System.out.println("   ");
		System.out.print(n1 + ", ");

		for (int n = 1; n < s; n++) {
			n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.print(n1 + ", "); 
			
		}

		sc.close();
	}
}