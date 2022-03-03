package laços;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner ler= new Scanner(System.in);
		
		System.out.print("escreva um número para n1");
		n1=ler.nextInt();
		System.out.print("escreva um numero para n2");
        n2=ler.nextInt();
        System.out.print("escreva um numero para n3");
        n3=ler.nextInt();
        
        if (n1 <= n2 && n2 <= n3)
        {
			System.out.println("A ordem crescente é: \n" + n1 + n2 + n3);
		}	
        else if(n1 <= n3 && n3 <= n2) {
    			System.out.println("A ordem crescente: \n" + n1 + n3 + n2);
    		}
    		else if(n2 <= n1 && n1 <= n3) {
    			System.out.println("A ordem crescente: " + n2 + n1 + n3);
    		}	
            else if(n3 <= n1 && n1 <= n2) {
        			System.out.println("A ordem crescente: \n" + n1 + n3 + n1);
        		}
            else if(n3 <= n1 && n1 <= n2) {
    			System.out.println("A ordem crescente: \n" + n3 + n1 + n2);
    		}
    		else 
    			System.out.println("A ordem crescente: \n" + n3 + n2 + n1);

    		ler.close();


}}
