package exercicios.video;

public class Main {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula POO");
		v[1] = new Video("Aula Java");
		v[2] = new Video("Aula React");
		
		Aluno a[] = new Aluno[2];
		
		a[0] = new Aluno("Pedro",22,"M", "pedro.bueno");
		a[1] = new Aluno("Mariana", 22,"F", "mariana_");
		
		Visualizacao vis[] = new Visualizacao[5];
		
		vis[0] = new Visualizacao(a[0],v[2]);
		vis[0].avaliar();
		vis[1] = new Visualizacao(a[0],v[0]);
		vis[1].avaliar(60.5);
		vis[2] = new Visualizacao(a[0],v[1]);
		vis[2].avaliar(9);
		a[0].setExperiencia(80.5);
		
		vis[3] = new Visualizacao(a[1],v[0]);
		vis[3].avaliar(90.8);
		vis[4] = new Visualizacao(a[1],v[1]);
		vis[4].avaliar();
		a[1].setExperiencia(77.0);
		
		
		for (Visualizacao vi : vis) {
			System.out.println(vi.toString());
		}
	}
}
