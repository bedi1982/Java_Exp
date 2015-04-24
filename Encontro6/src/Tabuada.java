public class Tabuada implements Runnable {

	public void tabuada(){
		for(int i = 0; i<= 10; i++ ){
			System.out.println("\nTabuada de " + i + ":" );
			for(int j = 0; j<= 10; j++ ){
				System.out.println(i + " x " + j + "= " + i*j);
			}
		}
	}

	@Override
	public void run() {
		this.tabuada();
	}
}