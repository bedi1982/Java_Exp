public class Main {

	public static void main(String[] args) {
		print_Exercicio1(0);      //positivo ou negativo
		print_Exercicio2(0);      //
		print_Exercicio4(10, 20); //maior
		print_Exercicio5(10, 20); //menor
		print_Exercicio6(10, 20, 30); //math.max
		print_Exercicio7(10, 20, 30); //math.max
		print_Exercicio8(); //math.max
		print_Exercicio9(); //math.max
	}
	
	public static void print_Exercicio1(int x){
		Encontro4 ex1 = new Encontro4();
		if(ex1.isPositive(x)){
			System.out.println("Ex1 -> Positive");
		}else{
			System.out.println("Ex2 -> Negative");
		}
	}

	public static void print_Exercicio2(int x){
		Encontro4 ex1 = new Encontro4();
		if(ex1.isZero(x)){
			System.out.println("Ex2 -> Is Zero");
		}else{
			System.out.println("Ex2 -> Is not Zero");
		}
	}
	
	public static void print_Exercicio4(int a, int b ){
		Encontro4 ex1 = new Encontro4();
		System.out.println("Ex4 -> Bigger is: " + ex1.ReturnBigger(a, b));
	}
	
	public static void print_Exercicio5(int a, int b ){
		Encontro4 ex1 = new Encontro4();
		System.out.println("Ex5 -> Smaller is: " + ex1.ReturnSmaller(a, b));
	}
	
	public static void print_Exercicio6(int a, int b, int c ){
		Encontro4 ex1 = new Encontro4();
		System.out.println("Ex6 -> MatchMax is: " + ex1.ReturnMathMax(a, b, c));
	}
	
	public static void print_Exercicio7(int a, int b, int c ){
		Encontro4 ex1 = new Encontro4();
		System.out.println("Ex7 -> MatchMin is: " + ex1.ReturnMathMin(a, b, c));
	}

	public static void print_Exercicio8(){
		Encontro4 ex1 = new Encontro4();
		System.out.println("Ex8 -> " + ex1.dado());
	}
	
	public static void print_Exercicio9(){
		Encontro4 ex1 = new Encontro4();
		ex1.probab();
		//System.out.println("Ex9 -> " + ex1.probab());
	}
	
}
