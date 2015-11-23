package aula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<String> frutas = new ArrayList<String>();
		frutas.add("Pera");
		frutas.add("Uva");
		frutas.add("Maça");
		frutas.add("Abacaxi");
		if (frutas.indexOf("Pêssego") == -1) {
			System.out.println("Não tem Pêssego");
		}

		for (int i = frutas.size() - 1; i >= 0; i--) {
			String str = frutas.get(i);
			if (str.equals("Uva")) {
				frutas.remove("Uva");
			}
			System.out.println(str);
		}
		for (String str : frutas) {
			// if (str.equals("Uva")){
			// frutas.remove("Uva");
			// }
			System.out.println(str);
		}

		ArrayList<Fruta> frutasObj = new ArrayList<Fruta>();
		frutasObj.add(new Fruta(1, "Morango", "Vermelho"));
		frutasObj.add(new Fruta(1, "Morango Silvestre", "Preto"));
		frutasObj.add(new Fruta(2, "Laranja", "Laranja"));
		frutasObj.add(new Fruta(3, "Melancia", "Verde"));
		Fruta m1 = frutasObj.get(0);
		Fruta m2 = frutasObj.get(1);
		System.out.println(m1.equals(m2));
		System.out.println(frutasObj);

		TreeSet<Fruta> frutasSet = new TreeSet<Fruta>();
		frutasSet.add(new Fruta(1, "Morango", "Vermelho"));
		System.out.println("Inseriu : "
				+ frutasSet.add(new Fruta(1, "Morango Silvestre", "Preto")));
		frutasSet.add(new Fruta(2, "Limão", "Verde"));
		
		Iterator<Fruta> iFruta = frutasSet.iterator();
		while (iFruta.hasNext()){
			System.out.println(iFruta.next());
		}
		
		HashMap<String, String> propriedades = new HashMap<String, String>();
		propriedades.put("PR", "Paraná");
		propriedades.put("SC", "Santa Catarina");
		propriedades.put("RS", "Rio Grande do Sul");
		propriedades.put("SP", "São Paulo");
		propriedades.put("SP", "São Paulo ccccccc");
		
		for (String key : propriedades.keySet()){
			System.out.println(propriedades.get(key));
		}
	}
}
