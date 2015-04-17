package sergio.r.lemke.gamev1.control;

import java.util.Arrays;
import java.util.Random;

public class Metodos {

	public void GenerateTable(){
		
		int[] bomb0 = this.ArmTheBombs();
		int[] bomb1 = this.ArmTheBombs();
		int[] bomb2 = this.ArmTheBombs();
		int[] bomb3 = this.ArmTheBombs();
		int[] bomb4 = this.ArmTheBombs();
		int[] bomb5 = this.ArmTheBombs();
		
		//create the table in ram
		char[][] tab = new char[10][10];

		//print Pretty Table
		for(int i = 0; i <tab.length; i++) {
			Arrays.fill(tab[i], '-');
		}

		//Arming the bombs!
		tab[bomb0[0]][bomb0[1]] = '0';
		tab[bomb1[0]][bomb1[1]] = '0';
		tab[bomb2[0]][bomb2[1]] = '0';
		tab[bomb3[0]][bomb3[1]] = '0';
		tab[bomb4[0]][bomb4[1]] = '0';
		tab[bomb5[0]][bomb5[1]] = '0';

		//Print the table
		System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
	}

	public int[] ArmTheBombs(){
		int[] x = new int[2];

		Random rn = new Random();
		if(x[0] != '-'){
			x[0] = rn.nextInt(10);
		}else{
			this.GenerateTable();
		}

		Random rn2 = new Random();
		if(x[0] != '-'){
			x[1] = rn2.nextInt(10);
		}else{
			this.GenerateTable();
		}

		System.out.println("Bomb Placed at: " + "L" + (x[0]) + " " + "C" + x[1]);
		return x;
	}
}