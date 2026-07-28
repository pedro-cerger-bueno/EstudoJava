package tipos;

// explicação dos tipos premitivos

public class Main {
	public static void main(String[] args) {
		
		// Variavel normal 
		String nome = "Pedro";
		
		// Variavel imutavel
		final String nomeFinal = "Pedro";
		
		
		// Variaveis numericas
		// Quanto maior o range de números de um tipo, maior o espaço que é ocupado na memória
		
		// byte - guarda valores númericos de -128 a 127
		byte byteVal = 1;
		
		// short - guarda valores de -32768 até 32767
		short shortVal = 300;
		
		// int - guarda valores de 2 bilhões negativo até 2 bilhões positivo
		int intVal = 50000;
		
		// long - aguenta números absurdos de grandes, precisa de um L no final
		long longVal = 2000000000000000000L;
		
		// float - números com até 7 casas decimais, precisa de um f no final
		float floatVal = 10.0f;
		
		// double - números com até 15 casas decimais
		double doubleVal = 10.20;
		
		
		
		
		// Variaveis textuais
		
		// char - guarda 1 caractere, usa aspas simples
		char charVal = 'x';
		
		
		// string - aspas duplas
		String n = "nome";
		
		// boolean - não aceita nulo
		boolean bool = true;
		
	}
}
