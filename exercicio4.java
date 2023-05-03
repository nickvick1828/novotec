package skibiridon;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio4{
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();	
        
        System.out.println("Digite o ano de nascimento: ");
        double dataNascimento = entrada.nextInt();
        
        double idade = 2023 - dataNascimento;
        
        System.out.println("voce se chama "+nome+" e voce tem "+idade+" anos");
       
	}
}


