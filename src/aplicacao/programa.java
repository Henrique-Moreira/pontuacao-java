package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qntC, atrasos, svc, si, sp;
		double tm;
		char pagamento;
		
		svc = 0;
		si = 0;
		sp = 0;

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
		
		if (atrasos > 1 || qntC == 0) {
			si = 0;
		}
		else if (atrasos == 1 && qntC > 0) {
			si = 15;
		}
		else if (atrasos == 0 && qntC > 0) {
			si = 30;
		}
		
		if (pagamento == 'D' || pagamento == 'd') {
			sp = 5;
		}
		else if (pagamento == 'C' || pagamento == 'c' || pagamento == 'B' || pagamento == 'b') {
			sp = 10;
		}
		
		System.out.println();
		System.out.println("Score de inadimplência = " + si + " pontos");
		System.out.println("Score de forma de pagamento = " + sp);
		sc.close();
	}

}
