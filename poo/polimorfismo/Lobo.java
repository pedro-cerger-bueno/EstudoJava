package polimorfismo;

public class Lobo extends Mamifero {
	
	@Override
	public void emitirSom() { // Sobreposição
		System.out.println("Uivando..");
	}
	
	
}
