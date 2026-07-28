package exercicios.video;

public class Visualizacao {
	private Aluno espectador;
	private Video filme;
	
	public Visualizacao(Aluno aluno, Video video) {
		this.espectador = aluno;
		this.filme = video;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(double porc) {
		int nota = 0; 
		if (porc <= 20) {
			nota = 3;
		} else if (porc <= 50) {
			nota = 5;
		} else if (porc <= 90 ) {
			nota = 8;
		} else {
			nota = 10;
		}
		this.filme.setAvaliacao(nota);
	}

	public Aluno getEspectador() {
		return espectador;
	}

	public void setEspectador(Aluno espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
	
	
}
