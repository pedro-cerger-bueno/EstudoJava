package tipos;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		String string = "Pedro Cerger Bueno  ";
		
		
		// Formatação de string
		
		String minusculo = string.toLowerCase();
		System.out.println("String inteira em letra minuscula: " + minusculo);
		
		
		String maiuscula = string.toUpperCase();
		System.out.println("String inteira em letra maiuscula: " + maiuscula);
		
		
		String formatada = string.trim();
		System.out.println("String sem espaços antes da primeira letra e depois da ultima: " + formatada);
		
		// Recortar String
		
		String substring = string.substring(2);
		System.out.println("String iniciada a partir do caractere na posição 2 da string original: " + substring);
		
		String substringIntervalo = string.substring(2,9);
		System.out.println("String da posição 2 a posição 9 da string original: " + substringIntervalo);
		
		
		// Substituir string
		
		String replaceChar = string.replace('e', 'u'); // parametro char (aspas simples)
		System.out.println("String com a letra 'u' substituindo a letra 'e': "+ replaceChar);
		
		
		String replaceString = string.replaceAll("er", "or"); // parametro string
		System.out.println("String substituindo a sequencia 'er' por 'or': "+ replaceString);
		
		// Posições da string
		int posicaoEr = string.indexOf("er");
		System.out.println("Index da primeira ocorrencia da sequencia er: " + posicaoEr);
		
		int finalEr = string.lastIndexOf("er");
		System.out.println("Index da ultima ocorrencia da sequencia er: " + finalEr);
		
		
		// !! Função split
		
		// Permite dividir a string em um vetor
		String[] vetor = string.split(" "); 
		System.out.println("Sprint dividade pelos espaços em branco: "+ Arrays.toString(vetor));
		
		String[] vetorE = string.split("e");
		System.out.println("Sprint dividade pela letra E: "+ Arrays.toString(vetorE));
		
	}
	
}
