import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListaDeAFazeres {
	List<Item> lista = new ArrayList<>();
	
	public void inserir(Item item){
		lista.add(item);
		
	}
	
	public void remover(Item item){
		lista.remove(item);
		
	}
	
	public void removerTodos(){
		lista.clear();
	}
	
	public void ordenar(){
		Collections.sort(this.lista);
	}
	
	public void imprimir(){
		System.out.println("---------Lista de A Fazeres---------");
		for (Item item : lista) {
			System.out.println(item);
		
		}
	}

}
