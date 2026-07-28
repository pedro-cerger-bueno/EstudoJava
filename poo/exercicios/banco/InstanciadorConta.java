package exercicios.banco;

public class InstanciadorConta {
	public static void main(String[] args) {
		ContaBanco conta = new ContaBanco();
		
		conta.abrirConta(1,"CC","Pedro");
		conta.status();
		conta.sacar(10);
		conta.status();
		conta.depositar(1000);
		conta.status();
		conta.pagarMensal();
		conta.sacar(250);
		conta.status();
	}
}
