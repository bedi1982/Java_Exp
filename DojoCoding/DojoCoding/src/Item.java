public class Item implements Comparable<Item>{
	private String nome;
	
	public Item(String nome){
		this.setNome(nome);
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	@Override
	public int compareTo(Item o) {
		return this.nome.compareTo(o.getNome());
	}
	
	@Override
	public String toString(){
		return "Item =>"+this.nome;
	}
}