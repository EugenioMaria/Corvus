import java.util.List;
import java.util.Scanner;
public class MainClass {
	public static void main(String args[]){
		Scanner _scan = new Scanner(System.in);
		int fatorial;
		int numero1;
		int numeroFinal;
		int numero2;
		int numero;
		int quantidade;
		int opcaoEscolhida;
		System.out.print("Digite 1 para gerar uma sequencia de Fibonacci ou 2 para calcular o fatorial\n");

		opcaoEscolhida = _scan.nextInt();
		if(opcaoEscolhida==1) {
			System.out.print("Digite a quantidade de numeros de Fibonacci\n");
			quantidade = _scan.nextInt();
			System.out.print("1 1 ");
			quantidade = quantidade-2;
			numero1 = 1;
			numero2 = 1;
			while(0<quantidade){
				numeroFinal = numero1+numero2;
				System.out.print(numeroFinal);
				System.out.print(" ");
				numero1 = numero2;
				numero2 = numeroFinal;
				quantidade = quantidade-1;
			}

		} else {
			fatorial = 1;
			System.out.print("Digite um numero\n");
			numero = _scan.nextInt();
			while(0<numero){
				fatorial = fatorial*numero;
				numero = numero-1;
			}
			System.out.print(fatorial);
		}

    }
}