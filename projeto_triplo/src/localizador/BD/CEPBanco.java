package localizador.BD;

import java.util.ArrayList;
import java.util.List;

import localizador.model.CEP;

public class CEPBanco {

	private static List<CEP> ceps = new ArrayList<>();

	private CEPBanco() {}
	
	private static void iniciarLista() {
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		List<String> l3 = new ArrayList<>();
		List<String> l4 = new ArrayList<>();
		l1.add("Campo Formoso - BA");
		l2.add("Praça Castro Alves");
		l3.add("Rua Centro");
		l4.add("Rua Chile");
		ceps.add(new CEP(44790000,l1));
		ceps.add(new CEP(40020160,l2));
		ceps.add(new CEP(41500620,l3));
		ceps.add(new CEP(40020000,l4));
	}

	public static CEP encontrarCEP(String logradouro) {
		iniciarLista();
		for (CEP cep : ceps) {
			if (cep.acharLogradouro(logradouro))
				return cep;
		}
		return null;
	}
}
