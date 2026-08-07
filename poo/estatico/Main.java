package estatico;

public class Main {

	public static void main(String[] args) {
		Gato ozzy = new Gato();
		ozzy.nome = "Ozzy";
		ozzy.idade = 2;
		System.out.println(Gato.count);
		System.out.println(Gato.MAXIMO_VIDAS);

	}

}
