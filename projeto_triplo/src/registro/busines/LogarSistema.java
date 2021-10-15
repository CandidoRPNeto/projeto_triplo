package registro.busines;

import registro.BD.ContaBnco;

public class LogarSistema {

	private LogarSistema() {}

	public static boolean confirmarCredenciais(String login,String senha) {
		return ContaBnco.confirmarCredenciais(login, senha);
	}
}
