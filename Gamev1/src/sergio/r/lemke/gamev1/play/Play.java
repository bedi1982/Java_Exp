package sergio.r.lemke.gamev1.play;
import java.util.Arrays;
import java.util.Scanner;

import sergio.r.lemke.gamev1.control.Metodos;

public class Play{	
	public void Jogar() {
		Metodos metodos = new Metodos();
		char[][] tab = new char[10][10];
		char[][] tabfake = new char[10][10];

		for(int i = 0; i <tabfake.length; i++) {
			Arrays.fill(tabfake[i], '*');
		}


		tab = metodos.generateTable();

		//posição inicial
		int x = 5;
		int y = 5;
		tab[x][y] = 'P';
		tabfake[x][y] = 'P';
		//

		Scanner sc = new Scanner(System.in);
		System.out.flush();
		System.out.println("Insira seu nome");
		String nome = sc.next();
		System.out.println("O seu usuário está representado com a letra P\n");
		System.out.println(Arrays.deepToString(tabfake).replace("],","]\n").replace(","," "));


		String t;
		boolean a = true;

		while(a == true){
			System.out.println("Olá " + nome + ", acima seu Tabuleiro\n");
			System.out.println("Insira uma das seguintes letras para pular de posição: c(sobe), b(desce), d(direita), e(esquerda)");
			t = sc.next();

			switch (t) {
			case "b":
				if(x == 9){
					System.out.println("Invalid Positon, you falled down the hill and are dead.\n GAME OVER");
					a = false;
				}else{
					tab[x][y]= '*';
					tabfake[x][y]= '*';
					x++;
					if(tab[x][y] != '*' ){
						tabfake[x][y] = '$';
						print(tabfake);
						System.out.println("It was a Trap Bino - GAME OVER");
						/*if bomba pode ser combatida pelo o que carrego
						 * retorna true;
						 * else
						 * false;
						 * */
						a = false;
						break;
					}else{
						tab[x][y]= 'P';
						tabfake[x][y]= 'P';
						System.out.flush(); 
						print(tabfake);
						break;
					}
				}

			case "c":
				if(x == 0){
					System.out.println("Invalid Positon, you falled down the hill and are dead.\n GAME OVER");
					a = false;
				}else{
					tab[x][y]= '*';
					tabfake[x][y]= '*';
					x--;
					if(tab[x][y] != '*' ){
						tabfake[x][y] = '$';
						print(tabfake);
						System.out.println("It was a Trap Bino - GAME OVER");
						a = false;
					}else{
						tab[x][y]= 'P';
						tabfake[x][y]= 'P';
						System.out.flush(); 
						print(tabfake);
					}
				}
				break;

			case "e":
				if(y == 0){
					System.out.println("Invalid Positon, you falled down the hill and are dead.\n GAME OVER");
					a = false;
				}else{

					tab[x][y]= '*';
					tabfake[x][y]= '*';
					y--;
					if(tab[x][y] != '*' ){
						tabfake[x][y] = '$';
						print(tabfake);
						System.out.println("It was a Trap Bino - GAME OVER");
						a = false;
					}else{

						tab[x][y]= 'P';
						tabfake[x][y]= 'P';
						System.out.flush(); 
						print(tabfake);
					}
				}
				break;

			case "d":
				if(y == 9){
					System.out.println("Invalid Positon, you falled down the hill and are dead.\n GAME OVER");
					a = false;
				}else{
					tab[x][y]= '*';
					tabfake[x][y]= '*';
					y++;
					if(tab[x][y] != '*' ){
						tabfake[x][y] = '$';
						print(tabfake);
						System.out.println("It was a Trap Bino - GAME OVER");
						a = false;
					}else{
						tab[x][y]= 'P';
						tabfake[x][y]= 'P';
						System.out.flush(); 
						print(tabfake);
					}
				}
				break;

			default:
				System.out.println("Invalid Char");
				break;
			}
		}
		sc.close();
	}
	
	public void print(char[][] tab){
		System.out.println(Arrays.deepToString(tab).replace("],","]\n").replace(","," "));
	}
	
}