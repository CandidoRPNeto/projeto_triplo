package localizador.model;

import java.util.List;

public class CEP {
	private int numero;
	private List<String> logradouros;
	public CEP(int numero, List<String> logradouros) {
		this.logradouros = logradouros;
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public  boolean acharLogradouro(String logradouro) {
		for (String log : logradouros) {
			if (log.equals(logradouro))
				return true;
		}
		return false;
	}


}
