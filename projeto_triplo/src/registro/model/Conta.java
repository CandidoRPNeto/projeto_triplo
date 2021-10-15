package registro.model;

public class Conta {
	private String login, senha, logradouro;
	public Conta(String login, String senha, String logradouro) {
		this.senha = senha;
		this.login = login;
		this.logradouro = logradouro;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public boolean comparar(Conta c) {
		if(this.login.equals(c.getLogin()) && this.senha.equals(c.getSenha()))
			return true;
		return false;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
}
