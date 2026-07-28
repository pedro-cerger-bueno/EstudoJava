package tipos;

// explicação dos tipos wrappers, basicamente eles guardam variaveis primitivas em um objeto

// variaveis guardam o valor, wrappers guardam o endereço do valor
// wrapers usam mais memoria
// Wrappers possuem uma função toString. 

// IMPORTANTE!!

// wrappers permitem valores nulos, primitivos não
// wrappers possuem funções para manipulação dos valores
// é possivel fazer parsing de string para o tipo especifico 

public class Wrappers {
	
	//versão deprecated de atribuição:
	Integer int1 = new Integer(123);
	Double double1 = new Double(3.14);
	Character cha1 = new Character('a');
	Boolean bool1 = new Boolean(false);
	
	// Para atribuir um wrapper atualmente é igual uma variavel
	Integer int2 = 123;
	Double double2 = 3.14;
	Character cha2 = 'a';
	Boolean bool2 = false;
	
	
	
	// como retornar aos tipos primitivos
	int int3 = int2;
	double double3 = double2;
	char cha3 = cha2;
	boolean bool3 = bool2;
	
	
	// parsing
	int int4 = Integer.parseInt("123");
	double double4 = Double.parseDouble("3.14");
	char cha4 = "pizza".charAt(0); // atribui o caractere na posição 0.
	boolean bool4 = Boolean.parseBoolean("false");
	
	
	
	// todos os wrappers possuem muitas funcionalidades.
	
	
	

}
