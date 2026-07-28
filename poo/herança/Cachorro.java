package herança;

public class Cachorro extends Animal {
	private String nome;
	
	public Cachorro(String especie, String nome) {
		super(especie);
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
