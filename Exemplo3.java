package laços;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		int idade, infantil, juvenil, adulto;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("Escreva sua idade");
		idade= ler.nextInt();
		if (10 <= idade && idade<=14)
	     System.out.println("infantil");
		
		else if (15 <= idade && idade <= 17) {
			System.out.println("juvenil");
			
		}
		else if (18 <= idade && idade <=25)
		 System.out.println("adulto");
				

	}

}
