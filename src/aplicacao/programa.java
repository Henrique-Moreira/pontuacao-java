package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qntC, atrasos, svc;
		double tm;
		char pagamento;

		svc = 0;

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");

		System.out.println();
		System.out.print("Quantas compras o cliente fez no último ano? ");
		qntC = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		tm = sc.nextDouble();

		System.out.println();
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atrasos = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?");
		pagamento = sc.next().charAt(0);

		if (tm == 0) {
			svc = 0;
		}
		else if (tm <= 3000 && qntC > 2) {
			svc = 40;
		} 
		else if (tm <= 3000) {
			svc = 20;
		}
		else if (tm > 3000) {
			svc = 60;
		}

		System.out.println();
		System.out.println("Score de volume de compras = " + svc + " pontos");

		sc.close();
	}

}
