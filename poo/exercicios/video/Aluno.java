package exercicios.video;

public class Aluno extends Pessoa {
	private String login;
	private int totAssistido;
	
	public Aluno(String nome, int idade, String sexo, String login) {
		super(nome,idade,sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	public void viuMaisUm() {
		this.setTotAssistido(this.getTotAssistido() + 1);
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "Aluno [login=" + login + ", totAssistido=" + totAssistido + ", nome=" + nome + ", idade=" + idade
				+ ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
	
}
