package skibiridon;

import java.util.Scanner;

public class exercicio6 {


	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        
        System.out.println("Digite um numero: ");
        double numero1 = entrada.nextInt();	
        
        System.out.println("Digite outro numero: ");
        double numero2 = entrada.nextInt();
        
        double div = Math.sqrt((numero1 * numero1)+(numero2 * numero2));
        
        System.out.println("Valor da hipotenusa: " + div);
       
	}
}