package herança;

public class Main {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		
		v1.setNome("Pedro");
		v1.setIdade(22);
		v1.setSexo("M");
		
		
		a1.setNome("Maria");
		a1.setMatr(111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		
		b1.setNome("Raphael");
		b1.setMatr(222);
		b1.setCurso("Informática");
		b1.setIdade(17);
		b1.setSexo("M");
		b1.setBolsa(12.5);
		b1.pagarMensalidade();


	}

}
