package exercicios.banco;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void status() {
		System.out.println("NUM CONTA = " + getNumConta() +
				" | TIPO = " + getTipo() + " | DONO = " + getDono() + " | SALDO = "+ getSaldo() + " | STATUS = " + 
				(isStatus() ? "Aberto" : "Fechado"));
	}
	
	public void abrirConta(int numConta, String tipo, String dono) {
		
		switch (tipo) {
		case "CC":
			this.saldo += 50.0f;
			break;
		case "CP":
			this.saldo += 150.0f;
			break;
		default:
			throw new Error("Tipo inválido");
		}
		
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.status = true;
	}
	
	public void fecharConta() {
		if (!isStatus() || this.saldo > 0 || this.saldo < 0)
			throw new Error("Não foi possivel fechar a conta.");
		this.status = false;
	}
	
	public void depositar(float d) {
		if (!isStatus())
			throw new Error("Conta fechada!");
		this.saldo += d;
	}
	
	public void sacar(float d) {
		if (!isStatus())
			throw new Error("Conta fechada!");
		if (d > this.getSaldo()) {
			throw new Error("Saldo insuficiente!");
		}
		this.saldo -= d;
	}
	
	public void pagarMensal() {
		if (this.tipo.equals("CC")) {
			sacar(12.0f);
		} else if (this.tipo.equals("CP")) {
			sacar(20.0f);
		}
		
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
