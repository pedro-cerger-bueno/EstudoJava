package relacionamentoClasses;

public class Lutador implements ILutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int empates;
	private int derrotas;

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, 
			int empates) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;

	}

	@Override
	public void apresentar() {
		System.out.println("Lutador: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Altura: " + getAltura() + " m");
		System.out.println("Peso: " + getPeso() + " kg");
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Vitórias: " + getVitorias());
		System.out.println("Empates: " + getEmpates());
		System.out.println("Derrotas: " + getDerrotas());

	}

	@Override
	public void status() {
		System.out.println(getNome() + " é um peso " + getCategoria());
		System.out.println("Ganhou: " + getVitorias() + " vezes");
		System.out.println("Perdeu: " + getDerrotas() + " vezes");
		System.out.println("Empatou: " + getEmpates() + " vezes");

	}

	@Override
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);

	}

	@Override
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);

	}

	@Override
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (peso < 52.2) {
			this.categoria = "INVALIDO";
		} else if (peso < 70.4) {
			this.categoria = "LEVE";
		} else if (peso < 84.0) {
			this.categoria = "MÉDIO";
		} else {
			this.categoria = "PESADO";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

}
