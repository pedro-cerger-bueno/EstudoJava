package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Lobo l = new Lobo();
		
		c.reagir("Oi");
		c.reagir(20, 30);
		c.reagir(true);
		c.reagir(2,2.40);
		c.emitirSom();
		
		l.emitirSom();
	}

}
