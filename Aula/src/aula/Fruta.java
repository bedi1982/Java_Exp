package aula;

public class Fruta implements Comparable<Fruta> {
	private int id;
	private String nome;
	private String cor;

	public Fruta() {

	}

	public Fruta(int id, String nome, String cor) {
		this.id = id;
		this.nome = nome;
		this.cor = cor;
	}

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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Fruta) {
			return this.id == ((Fruta) obj).id;
		}
		return false;
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int compareTo(Fruta o) {
		if (this.id < o.id) {
			return 1;
		}
		if (this.id == o.id) {
			return 0;
		}
		return -1;
	}

}
