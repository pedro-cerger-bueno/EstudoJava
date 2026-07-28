package relacionamentoClasses;

public class Main {
	public static void main(String[] args) {
		Lutador[] lutadores = new Lutador[6];
		
		lutadores[0] = new Lutador("Pretty boy", 	"França", 	 31, 	1.75, 	68.9, 	11, 3, 1);
		lutadores[1] = new Lutador("Putscript", 	"Brasil", 	 29,	1.68,	57.8,	14, 2, 3);
		lutadores[2] = new Lutador("Snapshadow", 	"EUA", 		 35,	1.65,	80.9,	12, 2, 1);
		lutadores[3] = new Lutador("Dead Code", 	"Australia", 28, 	1.93, 	81.6, 	13, 0, 2);
		lutadores[4] = new Lutador("Ufocobol", 		"Brasil", 	 37,	1.70,	119.3,	5,  4, 3);
		lutadores[5] = new Lutador("Nerdaard", 		"EUA", 		 30, 	1.81, 	105.7, 	12, 2, 4);
		
		
		System.out.println("================================================");
		Luta UEC1 = new Luta();
		UEC1.marcarLuta(lutadores[0], lutadores[1]);
		UEC1.lutar();
		System.out.println("================================================");
		Luta UEC2 = new Luta();
		UEC2.marcarLuta(lutadores[2], lutadores[3]);
		if (UEC2.isAprovada())
			UEC2.lutar();
		
		System.out.println("================================================");
		Luta UEC3 = new Luta();
		UEC3.marcarLuta(lutadores[1], lutadores[5]);
		UEC3.lutar();
		System.out.println("================================================");
		Luta UEC4 = new Luta();
		UEC4.marcarLuta(lutadores[0], lutadores[3]);
		if (UEC4.isAprovada())
			UEC4.lutar();
		System.out.println("================================================");
		Luta UEC5 = new Luta();
		UEC5.lutar();
		System.out.println("================================================");
		Luta UEC6 = new Luta();
		UEC6.marcarLuta(lutadores[4], lutadores[4]);
		UEC6.lutar();
		System.out.println("================================================");
		Luta UEC7 = new Luta();
		UEC7.marcarLuta(lutadores[0], lutadores[0]);
		if (UEC7.isAprovada())
			UEC7.lutar();
		System.out.println("================================================");
		
	}
}
