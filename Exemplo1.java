package la�os;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int x, y, z;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("escreva um n�mero para x");
		x=ler.nextInt();
		System.out.print("escreva um numero para y");
        y=ler.nextInt();
        System.out.print("escreva um numero para z");
        z=ler.nextInt();
         
        if (x>y && x>z)
        {
			System.out.println("Maior n�mero: \n" + x);
		}
        else if(y > x && y > z) {
			System.out.println("Maior n�mero: \n" + y);
		}
		else if(z > x && z > y) {
			System.out.println("Maior n�mero: " + z);

		ler.close();

		}
        
 
       	
	}  

}
