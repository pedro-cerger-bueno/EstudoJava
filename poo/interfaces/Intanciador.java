package interfaces;

public class Intanciador {

	public static void main(String[] args) {
		Controlador c = new ControleRemoto();
		
		c.ligar();
		c.abrirMenu();
		
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		
		c.abrirMenu();
		
		c.menosVolume();
		c.abrirMenu();
		
		c.maisVolume();
		c.maisVolume();
		c.ligarMudo();
		c.abrirMenu();
	}

}
