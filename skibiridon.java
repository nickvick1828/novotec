package skibiridon;

	import java.util.Scanner;
	
	public class skibiridon {
		
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);        
	    int num1;
	        int num2;
	        
	        System.out.print("Digite o primeiro número: ");
	        num1 = entrada.nextInt();	
	        
	        System.out.print("Digite o segundo número: ");
	        num2 = entrada.nextInt();
	        
	        System.out.println();
	        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
	        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
	        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );  
	        System.out.println(num1 + " * " + num2 + " = " + (num1 / num2) );  
	        double x = 5; 
	        double z = x * x; 
	        System.out.println (z);
	        int y = 2;
	        Math.sqrt(y);

	    }

	}