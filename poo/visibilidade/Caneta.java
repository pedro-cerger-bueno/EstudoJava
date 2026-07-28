package visibilidade;

public class Caneta {
	public String modelo;
	private String cor;
	private boolean tampada;
	// metodos construtor
	
	public Caneta() {
		this.tampar();
		this.cor = "Azul";
	}
	
	public Caneta(String modelo, String cor, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.tampada = tampada;
	}
	
	// getters e setters
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	// utilidades
	
	public void tampar() {
		this.setTampada(true);
	}
	
	public void destampar() {
		this.setTampada(false);
	}
	
	
	public void status() {
		if (this.tampada)
			System.out.println("Caneta " + this.modelo + " " + this.cor + " tampada");
		else 
			System.out.println("Caneta " + this.modelo + " " + this.cor + " aberta");
	}

	
}
