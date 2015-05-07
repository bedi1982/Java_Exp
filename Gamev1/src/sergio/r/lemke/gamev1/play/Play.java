package sergio.r.lemke.gamev1.play;
import java.util.Arrays;
import java.util.Scanner;
import sergio.r.lemke.gamev1.control.Metodos;

public class Play{	
	public void Jogar() {
		Metodos metodos = new Metodos();
		char[][] tab = new char[10][10];
		tab = metodos.generateTable();
		int x = 5;
		int y = 5;
		tab[x][y] = 'P';
		System.out.flush(); 
		System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
		
		Scanner sc = new Scanner(System.in);
		String t;
		boolean a = true;
	
	while(a == true){
		System.out.println("c, b, d, e");
		t = sc.next();
	
	switch (t) {
		case "b":
			tab[x][y]= '*';
			x++;
			if(tab[x][y] != '*' ){
				System.out.println("Bomb");
				/*if bomba pode ser combatida pelo o que carrego
				 * retorna true;
				 * else
				 * false;
				 * */
				 a = false;
			}
			tab[x][y]= 'P';
			System.out.flush(); 
			System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
			break;
			
		case "c":
			tab[x][y]= '*';
			x--;
			if(tab[x][y] != '*' ){
				System.out.println("Bomb");
				a = false;
			}
			tab[x][y]= 'P';
			System.out.flush(); 
			System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
			break;
			
		case "e":
			tab[x][y]= '*';
			y--;
			if(tab[x][y] != '*' ){
				System.out.println("Bomb");
				a = false;
			}
			
			tab[x][y]= 'P';
			System.out.flush(); 
			System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
			break;
			
		case "d":
			tab[x][y]= '*';
			y++;
			if(tab[x][y] != '*' ){
				System.out.println("Bomb");
				a = false;
			}
	
			tab[x][y]= 'P';
			System.out.flush(); 
			System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
			break;

		default:
			System.out.println("Invalid Char");
			break;
		}
	}
	}
}