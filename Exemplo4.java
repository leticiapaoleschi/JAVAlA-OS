package laços;

import java.io.InputStream;
import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		int numero;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero=ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número Par e Raiz quadrada:  " + Math.sqrt(numero));
		} else {
			System.out.println("Número Ímpar e " + Math.pow(numero, 2));
		}
		
		ler.close();
		

	}


}
