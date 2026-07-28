package classes;

public class Instanciador {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.carga = 100;
		
		c1.tampar();
		c1.rabiscar();
		c1.destampar();
		c1.rabiscar();
		
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.modelo = c1.modelo;
		c2.cor = "Vermelha";
		c2.tampada = true;
		c2.carga = 30;
		c2.ponta = 1.0f;
		
		c2.tampar();
		c2.rabiscar();
		c2.destampar();
		c2.rabiscar();
		
		c2.status();
		
	}
}
