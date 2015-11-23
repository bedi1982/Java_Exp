package aula;

public class Config {
	private String chave;
	private String valor;

	public Config() {

	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Config) {
			return this.chave.equals(((Config) obj).chave);
		}
		return false;
	}

	@Override
	public String toString() {
		return chave + " : " + valor;
	}

}
