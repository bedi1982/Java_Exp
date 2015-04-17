import java.util.Random;

public class Encontro4 {

	public boolean isPositive(int s){
		return((s % 2)== 0);
	}

	public boolean isZero(int s){
		return(s == 0);
	}

	public int ReturnBigger(int a, int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}

	public int ReturnSmaller(int a, int b){
		if(a < b){
			return a;
		}else{
			return b;
		}
	}

	public int ReturnMathMax(int a, int b, int c){
		int d =  Math.max(a, b);
		if(d > c){
			return d;
		}else{
			return c;
		}
	}

	public int ReturnMathMin(int a, int b, int c){
		int d =  Math.min(a, b);
		if(d < c){
			return d;
		}else{
			return c;
		}
	}

	public String dado(){
		Random rn = new Random();
		return "RANDOM: " + (rn.nextInt(6)+1);
	}

	public void probab(){
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;

		Random rn = new Random();

		for(int i = 0; i<100000; i++){
			int x = rn.nextInt(6)+1;
			switch(x){
			case 1:
				n1++;
				break;

			case 2:
				n2++;
				break;

			case 3:
				n3++;
				break;

			case 4:
				n4++;
				break;

			case 5:
				n5++;
				break;

			case 6:
				n6++;
				break;
			}
		}
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
	}
}