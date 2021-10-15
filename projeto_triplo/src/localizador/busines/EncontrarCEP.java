package localizador.busines;

import localizador.BD.CEPBanco;
import localizador.model.CEP;

public class EncontrarCEP {

	private EncontrarCEP() {}

	public static int retornarCEP(String lodradouro) {
		CEP cep = CEPBanco.encontrarCEP(lodradouro);
		return cep.getNumero();
	}
}
