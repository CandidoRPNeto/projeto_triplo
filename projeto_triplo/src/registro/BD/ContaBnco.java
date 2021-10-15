package registro.BD;

import java.util.ArrayList;
import java.util.List;

import registro.model.Conta;

public class ContaBnco {
	private static List<Conta> contas = new ArrayList<>();
	private ContaBnco() {}
	private static void iniciarLista() {
		contas.add(new Conta("admin","admin","Campo Formoso - BA"));
		contas.add(new Conta("ana_lima@hotmail.com","1124","Praça Castro Alves"));
		contas.add(new Conta("jaime_matos@hotmail.com","6329", "Rua Centro"));
		contas.add(new Conta("aline_medeiros@hotmail.com","5379","Rua Chile"));
	}

	public static boolean confirmarCredenciais(String login,String senha) {
		iniciarLista();
		for (Conta conta : contas) {
			System.out.println(conta.getLogin());
			if (conta.comparar(new Conta(login, senha, "")))
				return true;
		}
		return false;
	}

}
