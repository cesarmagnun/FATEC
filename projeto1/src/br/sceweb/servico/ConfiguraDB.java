package br.sceweb.servico;
/**
 * Classe respons�vel por configurar os par�metros de conex�o do Banco de Dados
 * @author Lab103
 * @version 1
 */
public class ConfiguraDB {
	String url = "";
	String driver = "";
	String usuario = "";
	String senha = "";
	
	public ConfiguraDB(String url, String driver, String usuario, String senha) {
		this.url = url;
		this.driver = driver;
		this.usuario = usuario;
		this.senha = senha;
	}
	public String getUrl() {
		return url;
	}
	public String getDriver() {
		return driver;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	
	
}