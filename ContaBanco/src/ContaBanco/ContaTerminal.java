package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu n�mero: ");
		int numero = scanner.nextInt();
		
		System.out.println("Digite a sua ag�ncia: ");
		String agencia = scanner.next();
		
		System.out.println("Digite seu nome: ");
		String nomeCliente1 = scanner.next();
		String nomeCliente2 = scanner.next();
		
		String nomeCliente3 = nomeCliente1 + " " + nomeCliente2;
		
		double saldo = 275.52;
		
		System.out.println("Ol�, " + nomeCliente3.concat(" ") + ", obrigado por criar uma conta em nosso banco,");
		System.out.println("sua ag�ncia � " + agencia + ", conta  " + numero + " e seu saldo " + saldo + " j� dispon�vel para saque.");
		
		scanner.close();
	}

}