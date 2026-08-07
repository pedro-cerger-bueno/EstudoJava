package estatico;

public class Gato {
	public static int count = 0;
	public static final int MAXIMO_VIDAS = 9;
	public String nome;
	public int idade;
	public int vidasSobrando;
	
	public Gato(){
		count++;
		this.vidasSobrando = MAXIMO_VIDAS;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVidasSobrando() {
		return vidasSobrando;
	}

	public void setVidasSobrando(int vidasSobrando) {
		this.vidasSobrando = vidasSobrando;
	}
	
	
	
	
}
