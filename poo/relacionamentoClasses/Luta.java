package relacionamentoClasses;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public Luta() {
		this.aprovada = false;
	}
	public void marcarLuta(Lutador desafiante, Lutador desafiado) {
		if (desafiante.equals(desafiado)) {
			System.out.println("Os lutadores não podem ser a mesma pessoa.");
			setAprovada(false);
		} else if (!desafiante.getCategoria().equals(desafiado.getCategoria())) {
			System.out.println("A categoria entre os lutadores devem ser a mesma!");
			setAprovada(false);
		} else {
			this.desafiante = desafiante;
			this.desafiado = desafiado;
			setAprovada(true);
		}
	}
	
	public void lutar() {
		if (!isAprovada()) {
			System.out.println("Luta não aprovada");
			return;
		}
		System.out.println("DESAFIADO: ");
		this.desafiado.apresentar();
		System.out.println();
		System.out.println("DESAFIANTE");
		this.desafiante.apresentar();
		
		Random aleatorio = new Random();
		int vencedor = aleatorio.nextInt(3);
		
		switch (vencedor) {
			case 0:
				System.out.println("Empate!");
				this.desafiante.empatarLuta();
				this.desafiado.empatarLuta();
				break;
			case 1:
				System.out.println(desafiado.getNome() + " Ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println(desafiante.getNome() + " Ganhou!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
			
		}
		
		
		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
