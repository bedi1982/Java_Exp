import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {
	Scanner sc = new Scanner(System.in); 

	public void ex1_2_e_3(){
		int n[] = new int[5];

		System.out.println("Insira 5 numeros");

		try{
			for(int i = 0; i<=4; i++ ){
				n[i] = sc.nextInt();
			}

			for(int i = 0; i <=4; i++){
				System.out.println("order inputed: " + n[i]);
			}
			System.out.println("\n");

			for(int i = 4; i >=0; i--){
				System.out.println("order inverted: " + n[i]);
			}
			System.out.println("\n");

			Arrays.sort(n);
			for(int i = 0; i <=4; i++){
				System.out.println("order crescente: " + n[i]);
			}
		}catch(InputMismatchException e){
			System.out.println("Tipo do erro " + e);
		} finally{
			System.out.println("Finally block Reached");
		}
	}

	public void ex4(){
		String s[] = new String[6];
		System.out.println("Insert 6 words...");

		for(int i = 0; i<6; i++ ){
			s[i] = sc.next();
		}

		Arrays.sort(s); //ordena por ordem alfabetica

		System.out.println(Arrays.toString(s).replace(",",""));

		sc.close();
	return;
	}
}