package sergio.r.lemke.gamev1.control;
import java.util.Arrays;
import java.util.Random;

public class Metodos {
	public char[][] generateTable(){

		char[][] tab = new char[10][10];

		for(int i = 0; i <tab.length; i++) {
			Arrays.fill(tab[i], '*');
		}
		
		int[] bomb0 = this.placeTheBombs(tab);
		tab[bomb0[0]][bomb0[1]] = '$';

		int[] bomb1 = this.placeTheBombs(tab);
		tab[bomb1[0]][bomb1[1]] = '$';

		int[] bomb2 = this.placeTheBombs(tab);
		tab[bomb2[0]][bomb2[1]] = '$';

		int[] bomb3 = this.placeTheBombs(tab);
		tab[bomb3[0]][bomb3[1]] = '$';

		int[] bomb4 = this.placeTheBombs(tab);
		tab[bomb4[0]][bomb4[1]] = '$';

		int[] bomb5 = this.placeTheBombs(tab);
		tab[bomb5[0]][bomb5[1]] = '$';
		
		return tab;
	}

	public int[] placeTheBombs(char[][] tab){
		int[] x = new int[2];

		Random rn = new Random();
		x[0] = rn.nextInt(10);

		Random rn2 = new Random();
		x[1] = rn2.nextInt(10);

		if(tab[x[0]][x[1]] != '*'){//check if the position in the table is available
			x = this.placeTheBombs(tab);
		}
		return x;
	}
}