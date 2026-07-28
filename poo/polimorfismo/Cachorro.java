package polimorfismo;

public class Cachorro extends Lobo {
	
	@Override // Sobreposição
	public void emitirSom() {
		System.out.println("Latindo...");
	}
	
	public void reagir(String frase) { 
		System.out.println("Reagiu a frase");
	}
	
	public void reagir(int hora, int minuto) { // Sobrecarga
		System.out.println("Reagiu a hora minuto");
	}
	
	public void reagir(boolean dono) { // Sobrecarga
		System.out.println("Reagiu ao dono");
	}
	
	public void reagir(int idade, double peso) { // Sobrecarga
		System.out.println("Reagiu a idade e peso");
	}
}
