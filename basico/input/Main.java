package input;

import java.util.Scanner;

public class Main {
	
	// sc.nextLine retorna a string digitada na linha inteira 
	// sc.next retorna a primeiro texto até o primeiro caracter vazio (espaço)
	// sc.nextInt retorna o int informado, sc.nextFloat retorna o float informado, sc.nextDouble retorna o double informado
	// sc.nextBoolean retorna o boolean informado
	
	// se digitar um tipo incompativel com o tipo informado irá dar erro.
	
	// funciona com print e println fica a preferencia

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome e sobrenome: ");
		String nome_sobrenome = sc.nextLine();
		
		System.out.print("Informe seu nome: ");
		String nome = sc.next();
		
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();		
		
		System.out.print("Informe um float");
		float decimalFloat = sc.nextFloat();
		
		System.out.print("Informe um double");
		double decimalDouble = sc.nextDouble();
		
		
		System.out.print("Informe um booleano");
		boolean bool = sc.nextBoolean();
		
		System.out.println("Nome e sobrenome: " + nome_sobrenome);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Float: " + decimalFloat);
		System.out.println("Double: " + decimalDouble);
		System.out.println("Boolean: " + bool);
		
		
		
		
		sc.close();
		
	}

}
