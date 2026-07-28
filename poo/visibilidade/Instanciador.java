package visibilidade;

public class Instanciador {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setModelo("BIC");
		c1.setCor("Preta");
		
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.setModelo("BIC");
		c2.status();
		
		Caneta c3 = new Caneta("AAA", "Verde", false);
		c3.status();
	}
}
