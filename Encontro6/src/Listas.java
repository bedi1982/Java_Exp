import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
	
	public static void starta(){
	List<String> cidades = new ArrayList<String>();	
	cidades.add("Curitiba1");
	cidades.add("Curitiba2");
	cidades.add("Curitiba3");
	Scanner sc = new Scanner(System.in);
	
	imprime(cidades,sc);

	System.out.println("Editando...\n");
	edita(cidades,sc);

	System.out.println("Adionando...\n");
	addCidade(cidades,sc);
	sc.close();
}

public static void imprime(List<String> x, Scanner y){
	System.out.println(x.toString());
}

public static void addCidade(List<String> x, Scanner y){
	System.out.println("Insira a cidade a adicionar");
	String val;
	val = y.next();
	x.add(val);
	imprime(x,y);
}

public static void edita(List<String> x, Scanner y){
	int pos;
	String val;
	System.out.println("Insira o Index para alterar\n");
	pos = y.nextInt();
	System.out.println("Insira o novo valor\n");
	val = y.next();

	x.set(pos, val);
	imprime(x,y);
}

public static void remove(List<String> x, Scanner y){
	int pos;
	System.out.println("Insira o Index para remover");
	pos = y.nextInt();
	x.remove(pos);
	imprime(x,y);
}
	
}
