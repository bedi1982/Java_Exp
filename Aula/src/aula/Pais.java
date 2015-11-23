package aula;

public class Pais {
	private int id;
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pais) {
			return this.id == ((Pais) obj).id;
		}
		return false;
	}

	@Override
	public String toString() {
		return nome;
	}

}
