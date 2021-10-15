package motivador.BD;

import java.util.ArrayList;
import java.util.List;

public class FrasesBancos {
	private static List<String> frases = new ArrayList<>();
	private static void iniciarLista() {
		frases.add("No meio da dificuldade encontra-se a oportunidade.");
		frases.add("Quando voc� quer alguma coisa, todo o universo conspira para que voc� realize o seu desejo.");
		frases.add("Nossa maior fraqueza est� em desistir. O caminho mais certo de vencer � tentar mais uma vez.");
		frases.add("As pessoas costumam dizer que a motiva��o n�o dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.");
		frases.add("S� se pode alcan�ar um grande �xito quando nos mantemos fi�is a n�s mesmos.");
	}
	public static String getFrase(int posi) {
		iniciarLista();
		return frases.get(posi);
	}
}
