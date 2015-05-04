package sergio.r.lemke.gamev1.play;
import java.util.Arrays;

import sergio.r.lemke.gamev1.control.Metodos;

public class Play{
    	
	public void Jogar() {
		Metodos metodos = new Metodos();
		char[][] tab = new char[10][10];
		tab = metodos.generateTable();
		tab[0][0] = '8';
		System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
	}
}