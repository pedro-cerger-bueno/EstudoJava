package herança;

public class Bolsista extends Aluno {
	private double bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de aluno " + this.nome);
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno bolsista " + this.nome);
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
