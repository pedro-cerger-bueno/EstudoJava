package exercicios.livro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("Aprendendo java", "Jose", 300, p[0]);
		l[1] = new Livro("Introdução POO", "Paulo", 500, p[1]);
		l[2] = new Livro("Java avançado", "Bruno", 800, p[0]);
		
		System.out.println(l[0].detalhes());
		System.out.println();
		
		l[1].abrir();
		l[1].folhear(900);
		System.out.println(l[1].detalhes());
		System.out.println();
		
		System.out.println(l[2].detalhes());
		System.out.println();
		
		System.out.println();
		
		
		
		
	}

}
