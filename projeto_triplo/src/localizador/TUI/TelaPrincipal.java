package localizador.TUI;

import localizador.busines.EncontrarCEP;
import registro.TUI.TelaRegistro;

public class TelaPrincipal {

	public static void main(String[] args) {
		TelaRegistro tl = new TelaRegistro();
		if (tl.pedirInformacoes()){
			System.out.println("Seu CEP é " + EncontrarCEP.retornarCEP(tl.getConta().getLogradouro()));
		}
	}

}
