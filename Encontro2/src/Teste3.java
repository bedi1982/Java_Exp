import java.util.Random;
import java.util.Scanner;


public class Teste3 {
	public static void main(String[] args){

		//Scanner Example:
				Scanner sc = new Scanner(System.in);
				String nome;
				nome = sc.next();
				System.out.println("Nome-> " + nome);
				sc.close();
		
		/*
		for(int i = 0; i <= 10; i+=2){
			System.out.println(i);
		}


		int i = 1;

		do{
			System.out.println("lala");
			i++;
		}while(i < 10);
	}*//*
		Random rn = new Random();
		int answer = rn.nextInt(50) + 51;
		System.out.println("Random 50 a 100: " + answer);

		for(int u = 0; u <=10; u++){
			System.out.println("Ex2: " + 7 * u);
		}

		int i = 0;
		while(i <= 10){
			System.out.println("Ex3: " + 7 * i);
			i++;
		}

		int f = 0;
		do{
			System.out.println("Ex4: " + 7 * f);
			f++;
		}while(f <= 10);


		for(int u = 0; u <=10; u++){
			for(int x = 0; x<= 10; x++){
				System.out.println(x + " x " + u + " = "+ x * u);
			}
		}
	 */

		int tot = 0 ;
		int tpar = 0;
		for(int u = 0; u <=10; u++){
			tot = tot + 7 * u;
			if(u %2 == 0){
				System.out.println("Ex7 Pares: " + 7 * u);
				tpar = tpar + u;
			}
		}
		System.out.println("TOT soma dos setes: " + tot / 2);
		System.out.println("TOT soma dos pares: " + tpar);

		if(tot > tpar){
			System.out.println("Total da soma dos resultados da multiplicação eh maior que os pares" );
		}

		if(tot == tpar){
			System.out.println("Total da soma dos resultados da multiplicação eh igual que os pares" );
		} 

		if(tot < tpar){
			System.out.println("Total da soma dos resultados da multiplicação de menor que os pares" );
		} 

	}	
}