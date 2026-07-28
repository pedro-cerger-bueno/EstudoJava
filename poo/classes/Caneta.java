package classes;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta " + this.modelo + " " + this.cor);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("Carga: "+ this.carga);
		System.out.println("Ponta: " + this.ponta);
	}
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}
