package polimorfismo;

public class Mamifero extends Animal {
	protected String corPelo;
	
	@Override // Sobreposição
	public void emitirSom() {
		System.out.println("Som de mamifero");
		
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
}
