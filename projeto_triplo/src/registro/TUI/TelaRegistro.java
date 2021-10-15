package registro.TUI;

import java.util.Scanner;

import registro.busines.LogarSistema;
import registro.model.Conta;

public class TelaRegistro {
	private Scanner s = new Scanner(System.in);
	private boolean validou = false;
	private static Conta conta;
	public TelaRegistro() {}
	public  boolean pedirInformacoes() {
		String login,senha,log;
		System.out.print("Informe seu login: ");
		login = s.nextLine();
		System.out.print("Informe sua senha: ");
		senha = s.nextLine();
		System.out.print("Informe seu logradouro: ");
		log = s.nextLine();
		System.out.println(confirmarCredenciais(login,senha,log));
		if (validou)
			return true;
		return false;
	}
	public String confirmarCredenciais(String login,String senha,String log) {
		if (LogarSistema.confirmarCredenciais(login,senha)) {
			validou = true;
			conta = new Conta(login,senha,log);
			return "Entrou";
		}
		validou = false;
		return "Credenciais Invalidas";
	}
	public Conta getConta() {
		return conta;
	}

}
