package motivador.TUI;

import motivador.busines.Frases;
import registro.TUI.TelaRegistro;

public class TelaPrincipal {

	public static void main(String[] args) {
		TelaRegistro tl = new TelaRegistro();
		if (tl.pedirInformacoes()){
			System.out.println("Aqui esta uma frase exclusiva para você");
			System.out.println();
			System.out.println(Frases.getFraseAleatoria());
		}
	}

}
