package motivador.BD;

import java.util.ArrayList;
import java.util.List;

public class FrasesBancos {
	private static List<String> frases = new ArrayList<>();
	private static void iniciarLista() {
		frases.add("No meio da dificuldade encontra-se a oportunidade.");
		frases.add("Quando você quer alguma coisa, todo o universo conspira para que você realize o seu desejo.");
		frases.add("Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez.");
		frases.add("As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.");
		frases.add("Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.");
	}
	public static String getFrase(int posi) {
		iniciarLista();
		return frases.get(posi);
	}
}
